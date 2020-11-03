package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    public Skill() {

    }
    @Size(max = 800, message = "Too long")
    private String description;
}