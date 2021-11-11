package com.conference.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "talk")
public class Talk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "abstract", nullable = false)
    private String abstract_info;

    @Column(name = "room", nullable = false)
    private Long room;

    @Embedded
    private Speaker speaker;

    @Embedded
    private List<Attendes> attendes;
}
