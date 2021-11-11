package com.conference.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "conference_details")
public class ConferenceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long attendeId;

    private Long talkId;
}
