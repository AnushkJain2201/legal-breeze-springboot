package com.lb.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "providers")
@PrimaryKeyJoinColumn(name = "user_id") // This links the primary key of providers table to user_id in the users table
public class Provider extends User {
    // Remove the providerId field and its annotations
    // @Id
    // @Column(name = "provider_id")
    // private Integer providerId;
    
    @ManyToOne
    @JoinColumn(name = "provider_type_id")
    private ProviderType providerType;
}