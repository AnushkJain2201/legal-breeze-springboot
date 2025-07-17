package com.lb.models;

public enum ServiceType {
    FULL_SERVICE_PROVIDERS("Full-Service Providers"),
    LIMITED_SCOPE_PROVIDERS("Limited Scope Providers"),
    ALTERNATIVE_LEGAL_SERVICE_PROVIDERS("Alternative Legal Service Providers"),
    ONLINE_LEGAL_SERVICES("Online Legal Services");

    private final String name;

    ServiceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}