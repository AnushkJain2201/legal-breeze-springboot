package com.lb.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "hired_bid_applicants")
public class HiredBidApplicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hired_bid_applicant_id")
    private Integer hiredBidApplicantId;
    
    @ManyToOne
    @JoinColumn(name = "bid_id")
    private Bid bid;
    
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}