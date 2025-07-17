package com.lb.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "bid_applicants")
public class BidApplicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid_applicant_id")
    private Integer bidApplicantId;
    
    @ManyToOne
    @JoinColumn(name = "bid_id")
    private Bid bid;
    
    @ManyToOne
    @JoinColumn(name = "applicant_id")
    private User user;
    
    @Column(name = "bid_amount")
    private Integer bidAmount;
}
