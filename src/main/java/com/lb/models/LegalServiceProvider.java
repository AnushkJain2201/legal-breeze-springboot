package com.lb.models;

public class LegalServiceProvider {
    private LegalServiceCategory category;
    private Object subcategory; // Can be any of the subcategory enums
    
    public LegalServiceProvider(LegalServiceCategory category, Object subcategory) {
        this.category = category;
        this.subcategory = subcategory;
    }
    
    // Method to get subcategory based on main category
    public static Class<?> getSubcategoryEnum(LegalServiceCategory category) {
        switch (category) {
            case PROFESSIONAL_QUALIFICATION:
                return ProfessionalQualification.class;
            case PRACTICE_STRUCTURE:
                return PracticeStructure.class;
            case SERVICE_TYPE:
                return ServiceType.class;
            case SPECIALIZATION:
                return Specialization.class;
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }
    
    // Getters and setters
    public LegalServiceCategory getCategory() {
        return category;
    }
    
    public void setCategory(LegalServiceCategory category) {
        this.category = category;
    }
    
    public Object getSubcategory() {
        return subcategory;
    }
    
    public void setSubcategory(Object subcategory) {
        this.subcategory = subcategory;
    }
}
