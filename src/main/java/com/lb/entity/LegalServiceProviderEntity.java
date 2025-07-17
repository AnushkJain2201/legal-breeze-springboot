package com.lb.entity;

import com.lb.models.LegalServiceCategory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
(name = "legal_service_providers")
public class LegalServiceProviderEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private LegalServiceCategory category;
    
    @Column(name = "subcategory")
    private String subcategory; // Store as string to handle different enum types
    
    @Column(name = "description")
    private String description;
    
    // Constructors, getters, and setters
    public LegalServiceProviderEntity() {}
    
    public LegalServiceProviderEntity(String name, LegalServiceCategory category, String subcategory) {
        this.name = name;
        this.category = category;
        this.subcategory = subcategory;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public LegalServiceCategory getCategory() { return category; }
    public void setCategory(LegalServiceCategory category) { this.category = category; }
    
    public String getSubcategory() { return subcategory; }
    public void setSubcategory(String subcategory) { this.subcategory = subcategory; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
