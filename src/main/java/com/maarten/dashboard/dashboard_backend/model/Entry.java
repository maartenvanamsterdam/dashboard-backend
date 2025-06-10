package com.maarten.dashboard.dashboard_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private int energyLevel;
    private double sleepHours;
    private boolean workedOut;

    private String mood;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
