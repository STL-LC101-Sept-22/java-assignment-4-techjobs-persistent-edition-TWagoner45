package org.launchcode.techjobs.persistent.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min = 1, max = 70)
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer() {};


    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getLocation() {
        return location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
