package com.maarten.dashboard.dashboard_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "app_user") // prevents conflict with 'user'
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
