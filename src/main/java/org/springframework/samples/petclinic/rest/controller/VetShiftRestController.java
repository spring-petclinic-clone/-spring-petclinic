package org.springframework.samples.petclinic.rest.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vets/shifts")
public class VetShiftRestController {

    @PostMapping("/{shiftId}/assign")
    public ResponseEntity<String> assignVetShift(@PathVariable("shiftId") Integer shiftId, @RequestParam("vetId") Integer vetId) {
        return ResponseEntity.ok("Shift assigned successfully");
    }

    @GetMapping("/roster")
    public ResponseEntity<List<Integer>> getRosterCalendar() {
        return ResponseEntity.ok(List.of(1, 2, 3));
    }
}
