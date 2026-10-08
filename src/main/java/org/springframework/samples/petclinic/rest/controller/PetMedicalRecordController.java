package org.springframework.samples.petclinic.rest.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("api/medical-records")
public class PetMedicalRecordController {

    private final ClinicService clinicService;

    public PetMedicalRecordController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @PreAuthorize("hasRole(@roles.VET_ADMIN)")
    @PutMapping("/pets/{petId}")
    public ResponseEntity<?> updateMedicalRecord(@PathVariable int petId, @RequestBody Map<String, Object> updateDto) {
        Pet pet = clinicService.findPetById(petId);
        if (pet == null) {
            return ResponseEntity.notFound().build();
        }
        BeanUtils.copyProperties(updateDto, pet);
        clinicService.savePet(pet);
        return ResponseEntity.ok(Map.of("status", "updated", "petId", petId));
    }
}
