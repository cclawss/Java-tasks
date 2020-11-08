package com.company.AccountingProgram.AllTaxType;

import com.company.AccountingProgram.TaxType;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.intValue() <= 100_000) {
            return amount.multiply(BigDecimal.valueOf(0.10));
        } else {
            return amount.multiply(BigDecimal.valueOf(0.15));
        }
    }
}
