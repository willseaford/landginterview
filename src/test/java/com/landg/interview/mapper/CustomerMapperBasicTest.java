package com.landg.interview.mapper;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.landg.interview.datafactory.CustomerDataFactory;
import com.landg.interview.dto.Customer;
import com.landg.interview.dto.CustomerInfo;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CustomerMapperBasicTest {
    
    @InjectMocks
    private CustomerMapperBasic underTest;

    @Test
    void given_when_then() {
        //Given
        Customer customer = CustomerDataFactory.getFullCustomer();

        //When
        CustomerInfo actual = underTest.mapToCustomerInfo(customer);
        
        //Then
        assertThat(actual.getName()).isEqualTo(customer.getName());
        
        assertThat(actual.getaddressLine1()).isEqualTo(customer.getaddressLine1());
        assertThat(actual.getPostcode()).isEqualTo(customer.getPostcode());

        assertThat(actual.getFunds()).usingRecursiveComparison().isEqualTo(customer.getFunds());
        assertThat(actual.getTotalValue()).isEqualTo(customer.getTotalValue());
       
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         
        String formattedTestDateOfBirth = dateFormatter.format(customer.getDateOfBirth());
        String formattedActualDateOfBirth = actual.getDateOfBirth().format(dateTimeFormatter);

        assertThat(formattedActualDateOfBirth).isEqualTo(formattedTestDateOfBirth);



         
           
        
    }
}
