package com.lb.models;

import jakarta.persistence.*;
import java.sql.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cases")
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_id")
    private Integer caseId;
    
    private String issue;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User seeker;
    
    @ManyToOne
    @JoinColumn(name = "lawyer_id")
    private User provider;
    
    @Column(name = "start_date")
    private Date startDate;
    
    @Column(name = "end_date")
    private Date endDate;
    
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    
    @ManyToOne
    @JoinColumn(name = "court_id")
    private Court court;
    
    private Integer budget;
}
