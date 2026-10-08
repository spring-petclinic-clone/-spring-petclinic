package org.springframework.samples.petclinic.rest.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("api/billing")
public class BillingRestController {

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/invoices/{invoiceId}/pdf")
    public ResponseEntity<byte[]> downloadInvoicePdf(@PathVariable Long invoiceId) {
        byte[] pdfContent = ("Invoice statement for #" + invoiceId).getBytes();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(pdfContent, headers, HttpStatus.OK);
    }

    @PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
    @GetMapping("/invoices")
    public ResponseEntity<List<Map<String, Object>>> listAllInvoices() {
        List<Map<String, Object>> invoices = new ArrayList<>();
        for (long i = 1; i <= 50; i++) {
            invoices.add(Map.of("id", i, "amount", 120.50, "status", "PAID"));
        }
        return ResponseEntity.ok(invoices);
    }
}
