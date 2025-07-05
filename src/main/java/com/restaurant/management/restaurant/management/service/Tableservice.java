package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.TableDTO;
import com.restaurant.management.restaurant.management.Repository.Tablerepository;
import com.restaurant.management.restaurant.management.entity.Table;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Tableservice {

    private final Tablerepository tableRepository;

    public void createTable(TableDTO tableDTO) {
        Table table = new Table();
        table.setTableNumber(tableDTO.getTableNumber());
        table.setCapacity(tableDTO.getCapacity());
        table.setStatus(tableDTO.getStatus());
        tableRepository.save(table);
    }

    public List<TableDTO> getAllTables() {
        return tableRepository.findAll()
                .stream()
                .map(table -> {
                    TableDTO dto = new TableDTO();
                    dto.setId(table.getId());
                    dto.setTableNumber(table.getTableNumber());
                    dto.setCapacity(table.getCapacity());
                    dto.setStatus(table.getStatus());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
