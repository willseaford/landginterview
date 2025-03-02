package com.landg.interview.datafactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.landg.interview.dto.Customer;
import com.landg.interview.dto.Fund;

public class CustomerDataFactory {
    
    public static Customer getCustomer() {
        return Customer.builder()
            .name("Mr Joe Bloggs")
            .dateOfBirth(new Date())
            .addressLine1("1 Coleman Street")
            .postcode("EC2R 5AA")
        .build();
    }

    public static Customer getFullCustomer() {
        return Customer.builder()
            .name("Mr Joe Bloggs")
            .dateOfBirth(new Date())
            .addressLine1("1 Coleman Street")
            .postcode("EC2R 5AA")
            .funds(buildFunds())
            .totalValue(BigDecimal.valueOf(10000))
        .build();
    }

    private static List<Fund> buildFunds() {
        return Arrays.asList(
            new Fund("BY08", BigDecimal.valueOf(1450)),
            new Fund("GL9Q", BigDecimal.valueOf(2550)),
            new Fund("BY09", BigDecimal.valueOf(2200)),
            new Fund("AZ3F", BigDecimal.valueOf(1850)),
            new Fund("YU63", BigDecimal.valueOf(1950))
        );
    }
}
