package com.conference.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity(name = "attendes")
@Embeddable
public class Attendes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "registered", nullable = false)
    private LocalDate registered_date;
}
