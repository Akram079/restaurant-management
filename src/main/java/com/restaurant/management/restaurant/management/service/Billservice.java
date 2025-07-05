package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.BillDTO;
import com.restaurant.management.restaurant.management.entity.Bill;
import com.restaurant.management.restaurant.management.Repository.Billrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class Billservice {

    private final Billrepository billrepository;

    public void createBill(BillDTO dto) {
        Bill bill = new Bill();
        bill.setAmount(dto.getAmount());
        bill.setTotalPayable(dto.getTotalPayable());
        billrepository.save(bill);
    }

    public void updateBill(int id, BillDTO dto) {
        Optional<Bill> optional = billrepository.findById(id);
        if (optional.isPresent()) {
            Bill bill = optional.get();
            bill.setAmount(dto.getAmount());
            bill.setTotalPayable(dto.getTotalPayable());
            billrepository.save(bill);
        }
    }

    public void deleteBill(int id) {
        billrepository.deleteById(id);
    }
}
