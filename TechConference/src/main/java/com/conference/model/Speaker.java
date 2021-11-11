package com.conference.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class Speaker {

    private String name;

    private String company;

    private String email;

    private String bio;

}
