package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String employer;
    private String skills;

    public Job(int id) {
        this.id = id;
    }

    public Job(String anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Job() {

    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
