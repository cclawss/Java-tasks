package com.company.AccountingProgram;

import com.company.AccountingProgram.AllTaxType.IncomeTaxType;
import com.company.AccountingProgram.AllTaxType.ProgressiveTaxType;
import com.company.AccountingProgram.AllTaxType.VATaxType;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(BigDecimal.valueOf(100), new IncomeTaxType(), taxService),
                new Bill(BigDecimal.valueOf(200), new VATaxType(), taxService),
                new Bill(BigDecimal.valueOf(500), new ProgressiveTaxType(), taxService)
        };
        double allTaxes = 0.;
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
            allTaxes+=bill.getTaxAmount();
        }
        System.out.println("Весь налог: "+allTaxes);
    }
}
