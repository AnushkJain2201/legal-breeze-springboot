package com.lb.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lb.models.LegalServiceCategory;
import com.lb.models.PracticeStructure;
import com.lb.models.ProfessionalQualification;
import com.lb.models.ServiceType;
import com.lb.models.Specialization;


@RestController
@RequestMapping("/api/legal-services")
public class LegalServiceController {
    
    @GetMapping("/categories")
    public ResponseEntity<LegalServiceCategory[]> getCategories() {
        return ResponseEntity.ok(LegalServiceCategory.values());
    }
    
    @GetMapping("/subcategories/{category}")
    public ResponseEntity<?> getSubcategories(@PathVariable LegalServiceCategory category) {
        switch (category) {
            case PROFESSIONAL_QUALIFICATION:
                return ResponseEntity.ok(ProfessionalQualification.values());
            case PRACTICE_STRUCTURE:
                return ResponseEntity.ok(PracticeStructure.values());
            case SERVICE_TYPE:
                return ResponseEntity.ok(ServiceType.values());
            case SPECIALIZATION:
                return ResponseEntity.ok(Specialization.values());
            default:
                return ResponseEntity.badRequest().body("Unknown category");
        }
    }
}

