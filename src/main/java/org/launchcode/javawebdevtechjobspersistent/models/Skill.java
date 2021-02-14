package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();
    public String description;

    public Skill() {

    }

    public List<Job> getJobs() {
        return jobs;
    }
    public String getDescription() {
        return description;

    }


    public void setDescription(String description)  {
        this.description = description;

    }
}