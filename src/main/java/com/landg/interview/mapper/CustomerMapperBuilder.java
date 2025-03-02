package com.landg.interview.mapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import com.landg.interview.dto.Customer;
import com.landg.interview.dto.CustomerInfo;
import com.landg.interview.dto.Fund;

public class CustomerMapperBuilder {
    
    public CustomerInfo mapToCustomerInfo(Customer customer) {
        return CustomerInfo.builder()
        .name(customer.getName())
        .dateOfBirth(mapDateOfBirth(customer.getDateOfBirth()))
        .addressLine1(customer.getaddressLine1())
        .postcode(customer.getPostcode())

        //question 2
        .funds(customer.getFunds())
        .totalValue(calculateTotalValue(customer.getFunds()))
        .build();
    }

    private LocalDate mapDateOfBirth(Date dateOfBirth) {
        return dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private BigDecimal calculateTotalValue(List<Fund> funds) {
        return funds.stream()
        .map(Fund::getValue)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
    }


}
