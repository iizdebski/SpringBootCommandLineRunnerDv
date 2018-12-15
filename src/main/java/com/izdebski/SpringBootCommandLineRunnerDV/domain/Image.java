package com.izdebski.SpringBootCommandLineRunnerDV.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data

public class Image {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Image(String name) {
        this.name = name;
    }
}