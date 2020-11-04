package org.launchcode.javawebdevtechjobspersistent.models;

import jdk.jfr.Event;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @ManyToMany(mappedBy = "skills")
    private final List<Job> events = new ArrayList<>();

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