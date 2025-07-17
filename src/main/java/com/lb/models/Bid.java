package com.lb.models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bids")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid_id")
    private Integer bidId;

    @Column(name = "issue")
    private String issue;

    @Column(name = "description")
    private String description;

    @Column(name = "hearings")
    private Integer hearings;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @Column(name = "budget")
    private Integer budget;

    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "deadline")
    @Temporal(TemporalType.DATE)
    private Date deadline;

    @Column(name = "no_of_applicants")
    private Integer noOfApplicants;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructor for creating new bids (without bidId, hearings, noOfApplicants, status, user)
    public Bid(String issue, String description, Integer budget, Date startDate, Date deadline) {
        this.issue = issue;
        this.description = description;
        this.budget = budget;
        this.startDate = startDate;
        this.deadline = deadline;
    }
}