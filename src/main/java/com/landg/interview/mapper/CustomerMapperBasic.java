package com.landg.interview.mapper;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.List;

import com.landg.interview.dto.Customer;
import com.landg.interview.dto.CustomerInfo;
import com.landg.interview.dto.Fund;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerMapperBasic {

    public CustomerInfo mapToCustomerInfo(Customer customer) {
        CustomerInfo customerInfo = new CustomerInfo(
            customer.getName(),
            customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
            customer.getaddressLine1(),
            customer.getPostcode(),
            customer.getFunds(),
            calculateTotalValue(customer.getFunds())
        );

        return customerInfo;
    }

    private BigDecimal calculateTotalValue(List<Fund> funds) {
        int total = 0;

        for(Fund fund: funds) {
            total += fund.getValue().doubleValue();
        }

        return new BigDecimal(total);
    }
    
}
