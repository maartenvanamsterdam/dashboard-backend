package com.maarten.dashboard.dashboard_backend.service;

import com.maarten.dashboard.dashboard_backend.model.Entry;
import com.maarten.dashboard.dashboard_backend.repository.EntryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EntryService {

    private final EntryRepository repo;

    public EntryService(EntryRepository repo) {
        this.repo = repo;
    }

    public Entry create(Entry entry) {
        return repo.save(entry);
    }

    public List<Entry> getBetween(LocalDate from, LocalDate to) {
        return repo.findByDateBetween(from, to);
    }

    public List<Entry> getAll() {
        return repo.findAll();
    }
}
