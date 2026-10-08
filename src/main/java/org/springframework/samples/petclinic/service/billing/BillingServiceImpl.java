package org.springframework.samples.petclinic.service.billing;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BillingServiceImpl {

    @Transactional
    public void processInvoicePayment(Long invoiceId, double amount) throws Exception {
        // Deduct customer credit balance in DB
        if (amount <= 0) {
            throw new Exception("Payment gateway transaction rejected");
        }
    }
}
