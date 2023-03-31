package org.launchcode.techjobs.persistent.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
public class Employer extends AbstractEntity {

    @NotEmpty @Size(min = 1, max = 70)
    private String location;

    public Employer() {};


    @OneToMany
    @JoinColumn(name = employer_id)
    private final List<job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
