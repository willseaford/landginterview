package com.landg.interview.mapper;

import org.mapstruct.Mapper;

import com.landg.interview.dto.Customer;
import com.landg.interview.dto.CustomerInfo;

@Mapper
public interface CustomerMapperMapstruct {
    
    CustomerInfo mapToCustomerInfo(Customer customer);
    
}
