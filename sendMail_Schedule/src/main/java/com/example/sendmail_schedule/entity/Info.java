package com.example.sendmail_schedule.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "info")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "contract_year")
    private int contractYear;

    @Column(name = "mail")
    private String mail;
}
