package com.lb.models;

public enum UserType {
    SEEKER("Seeker"),
    PROVIDER("Provider");

    private final String name;

    UserType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
// public enum UserType {
// SEEKER,
// PROVIDER
// }

/*
    Approach 1 is generally better and more flexible for most real-world
    applications.

    Here's a breakdown of why:

    - Readability and Display Values: The primary advantage of Approach 1 is that
    it allows you to associate a more user-friendly or descriptive string (
    "Seeker" , "Provider" ) with each enum constant. While the enum constant
    itself is SEEKER or PROVIDER , you can easily retrieve a display name using
    getName() . This is very useful for UI display, logging, or generating
    reports where you don't want to show the raw enum constant name.
    - Decoupling from Constant Names: If, for some reason, you need to change the
    enum constant name (e.g., from SEEKER to APPLICANT ), the display name (
    "Seeker" ) can remain the same. This provides a layer of abstraction.
    - Database Storage (when using EnumType.STRING ): When you map this enum to a
    database column using @Enumerated(EnumType.STRING) , Hibernate will store the
    enum constant's name (e.g., "SEEKER" or "PROVIDER" ). If you later need to
    display a more readable version, you can use the getName() method. If you
    were to store the name field directly in the database, you would need a
    custom AttributeConverter .
    - Extensibility: This pattern makes it easier to add more properties to your
    enum constants in the future if needed (e.g., a short code, a description, an
    associated icon path).
    When might Approach 2 be sufficient?

    Approach 2 (the simple enum) is perfectly fine when:

    - The enum constant names themselves are sufficiently descriptive and don't
    require a separate display name.
    - You only ever need to refer to the enum by its constant name (e.g.,
    UserType.SEEKER ).
    - You are storing the enum's ordinal value ( EnumType.ORDINAL ) in the
    database, or the string representation of the constant name ( EnumType.STRING
    ) is acceptable for all purposes.
 */