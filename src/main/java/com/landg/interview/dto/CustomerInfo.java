package com.landg.interview.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerInfo {

    private String name;
    private LocalDate dateOfBirth;
    private String addressLine1;
    private String postcode;
    private List<Fund> funds;
    private BigDecimal totalValue;

    
    public CustomerInfo(String name, LocalDate dateOfBirth, String addressLine1, String postcode) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.addressLine1 = addressLine1;
        this.postcode = postcode;
    }

    public CustomerInfo(String name, LocalDate dateOfBirth, String addressLine1,
     String postcode, List<Fund> funds, BigDecimal totalValue) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.addressLine1 = addressLine1;
        this.postcode = postcode;
        this.funds = funds;
        this.totalValue = totalValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getaddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public List<Fund> getFunds() {
        return funds;
    }

    public void setFunds(List<Fund> funds) {
        this.funds = funds;
    }

    public BigDecimal getTotalValue(){
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }





    
}
