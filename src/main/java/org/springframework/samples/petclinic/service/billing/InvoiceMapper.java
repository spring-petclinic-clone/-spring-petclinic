package org.springframework.samples.petclinic.service.billing;

import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.service.ClinicService;
import java.util.*;

public class InvoiceMapper {

    public static List<Map<String, Object>> toInvoiceDto(ClinicService clinicService, List<Map<String, Object>> lineItems) {
        List<Map<String, Object>> result = new ArrayList<>();
        for (Map<String, Object> item : lineItems) {
            Integer visitId = (Integer) item.get("visitId");
            Visit v = (visitId != null) ? clinicService.findVisitById(visitId) : null;
            Map<String, Object> dto = new HashMap<>(item);
            dto.put("visitDescription", (v != null) ? v.getDescription() : "General Consultation");
            result.add(dto);
        }
        return result;
    }
}
