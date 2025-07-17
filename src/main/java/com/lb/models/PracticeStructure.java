package com.lb.models;

public enum PracticeStructure {
    SOLO_PRACTITIONER("Solo Practitioners"),
    SMALL_LAW_FIRM("Small Law Firms"),
    LARGE_LAW_FIRM("Large Law Firms"),
    CORPORATE_LEGAL_DEPARTMENT("Corporate Legal Departments"),
    GOVERNMENT_ATTORNEY("Government Attorneys"),
    LEGAL_AID_ORGANIZATION("Legal Aid Organizations");

    private final String name;

    PracticeStructure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}