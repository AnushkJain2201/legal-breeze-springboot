package com.lb.models;

public enum ProfessionalQualification {
    LICENSED_ATTORNEY("Licensed Attorneys/Lawyers"),
    PARALEGAL("Paralegals"),
    LEGAL_DOCUMENT_PREPARER("Legal Document Preparers"),
    NOTARY("Notaries");

    private final String name;

    ProfessionalQualification(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}