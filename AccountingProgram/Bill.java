package com.company.AccountingProgram;

import java.math.BigDecimal;

class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;
    private BigDecimal taxAmount = new BigDecimal(0.);

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public double getTaxAmount() {
        System.out.println(taxAmount.doubleValue());
        return taxAmount.doubleValue();
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
        taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}