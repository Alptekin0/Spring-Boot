package com.alptekin.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dbstudents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String fullName;

    @Column
    private Long number;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String address;

    @Column
    private String classroom;

    @Column
    private String parentName;

    @Column
    private String parentPhoneNumber;

    @Column
    private Double averageScore;

    @Column
    private Boolean active;

}
