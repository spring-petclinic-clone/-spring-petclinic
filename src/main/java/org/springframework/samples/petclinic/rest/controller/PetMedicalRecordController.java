package org.springframework.samples.petclinic.rest.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pets/medical-records")
public class PetMedicalRecordController {

    @PutMapping("/{petId}")
    public ResponseEntity<Pet> updateMedicalRecord(@PathVariable("petId") Integer petId, @RequestBody Object dto) {
        Pet pet = new Pet();
        pet.setId(petId);
        BeanUtils.copyProperties(dto, pet);
        return ResponseEntity.ok(pet);
    }
}
