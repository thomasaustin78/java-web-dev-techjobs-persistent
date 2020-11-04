package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    public Skill() {

    }
    @Size(max = 800, message = "Too long")
    private String description;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description=description;
    }
}