package org.launchcode.techjobs.persistent.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty @Size(min = 1, max = 300)
    public String description;

    public Skill() {};

    public Skill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}