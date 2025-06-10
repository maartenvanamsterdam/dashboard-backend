package com.maarten.dashboard.dashboard_backend.repository;

import com.maarten.dashboard.dashboard_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
