package com.lb.models;

public enum Specialization {
    GENERAL_PRACTICE("General Practice"),
    FAMILY_LAW("Family Law"),
    CRIMINAL_DEFENSE("Criminal Defense"),
    CORPORATE_LAW("Corporate Law"),
    IMMIGRATION_LAW("Immigration Law"),
    PERSONAL_INJURY("Personal Injury"),
    REAL_ESTATE("Real Estate"),
    EMPLOYMENT_LAW("Employment Law"),
    INTELLECTUAL_PROPERTY("Intellectual Property"),
    TAX_LAW("Tax Law");

    private final String displayName;

    Specialization(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}