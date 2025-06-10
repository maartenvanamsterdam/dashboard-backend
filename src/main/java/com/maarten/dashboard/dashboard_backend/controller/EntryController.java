package com.maarten.dashboard.dashboard_backend.controller;

import com.maarten.dashboard.dashboard_backend.model.Entry;
import com.maarten.dashboard.dashboard_backend.service.EntryService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {

    private final EntryService service;

    public EntryController(EntryService service) {
        this.service = service;
    }

    @PostMapping
    public Entry create(@RequestBody Entry entry) {
        return service.create(entry);
    }

    @GetMapping
    public List<Entry> getBetween(
            @RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
            @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to
    ) {
        return service.getBetween(from, to);
    }

    @GetMapping("/all")
    public List<Entry> getAll() {
        return service.getAll();
    }
}
