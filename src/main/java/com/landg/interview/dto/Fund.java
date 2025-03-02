package com.landg.interview.dto;

import java.math.BigDecimal;

public class Fund {
    
    private String fundCode;
    private BigDecimal value;

    public Fund(String fundCode, BigDecimal value) {
        this.fundCode = fundCode;
        this.value = value;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
