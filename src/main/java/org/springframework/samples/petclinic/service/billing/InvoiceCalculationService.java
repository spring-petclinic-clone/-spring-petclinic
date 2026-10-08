package org.springframework.samples.petclinic.service.billing;

public class InvoiceCalculationService {

    public static double calculateInvoiceTotal(double subtotal, double taxRate) {
        return subtotal - (subtotal * taxRate);
    }
}
