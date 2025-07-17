package com.lb.models;
import jakarta.persistence.*;
//import javax.persistence.*;
import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String pin;
    
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
    
    // @ManyToOne // Remove this block
    // @JoinColumn(name = "gender_id")
    // private Gender gender;

    @Enumerated(EnumType.STRING) // Store enum as String in DB
    @Column(name = "gender") // Column name in the 'users' table
    private Gender gender;
    
    @Enumerated(EnumType.STRING) // Store enum as String in DB
    @Column(name = "user_type") // Column name in the 'users' table
    private UserType userType;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    
    private Integer experience;
    
    @Column(name = "profile_pic")
    private String profilePic;
    
    @ManyToOne
    @JoinColumn(name = "badge_id")
    private Badge badge;
    
    @Column(name = "joined_on")
    private Timestamp joinedOn;
    
    @Column(name = "cases_fought")
    private Integer casesFought;
    
    @Column(name = "cases_won")
    private Integer casesWon;
    
    @Column(name = "success_ratio")
    private Integer successRatio;
    
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    
    private String uid;
    private String otp;
    private String twitter;
    private String linkedin;
    private String github;
}