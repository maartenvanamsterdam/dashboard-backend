package com.maarten.dashboard.dashboard_backend.repository;

import com.maarten.dashboard.dashboard_backend.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Long> {
    List<Entry> findByDateBetween(LocalDate from, LocalDate to);
}
