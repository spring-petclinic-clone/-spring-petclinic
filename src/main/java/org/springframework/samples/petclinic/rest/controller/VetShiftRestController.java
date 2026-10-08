package org.springframework.samples.petclinic.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("api/shifts")
public class VetShiftRestController {

    private final ClinicService clinicService;

    public VetShiftRestController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @PostMapping("/assign")
    public ResponseEntity<Map<String, String>> assignVetShift(@RequestBody Map<String, Object> shiftDetails) {
        return ResponseEntity.ok(Map.of("status", "assigned"));
    }

    @GetMapping("/roster")
    public ResponseEntity<List<Map<String, Object>>> getRosterCalendar() {
        List<Map<String, Object>> roster = new ArrayList<>();
        Collection<Vet> vets = clinicService.findAllVets();
        for (Vet v : vets) {
            Vet detailed = clinicService.findVetById(v.getId());
            roster.add(Map.of("vetId", v.getId(), "name", detailed.getFirstName() + " " + detailed.getLastName()));
        }
        return ResponseEntity.ok(roster);
    }
}
