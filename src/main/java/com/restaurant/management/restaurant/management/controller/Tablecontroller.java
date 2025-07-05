package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.TableDTO;
import com.restaurant.management.restaurant.management.service.Tableservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/tables")
public class Tablecontroller {

    private final Tableservice tableservice;

    @PostMapping
    public void createTable(@RequestBody TableDTO tableDTO) {
        tableservice.createTable(tableDTO);
    }

    @GetMapping
    public List<TableDTO> getAllTables() {
        return tableservice.getAllTables();
    }
}
