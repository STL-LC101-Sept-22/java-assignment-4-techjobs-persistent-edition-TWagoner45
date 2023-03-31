package org.launchcode.techjobs.persistent.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotEmpty @Size(min = 1, max = 70)
    private String location;

    public Employer() {};



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
