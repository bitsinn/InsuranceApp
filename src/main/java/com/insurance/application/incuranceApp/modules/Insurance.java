package com.insurance.application.incuranceApp.modules;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "notes")
    private String notes;
    private Person person;
    private Contributions contributions;
    private int personId;
    private int contributionsId;

    public Insurance(Long id, String notes, Person person, Contributions contributions, int personId, int contributionsId) {
        this.id = id;
        this.notes = notes;
        this.person = person;
        this.contributions = contributions;
        this.personId = personId;
        this.contributionsId = contributionsId;
    }

    public Insurance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Contributions getContributions() {
        return contributions;
    }

    public void setContributions(Contributions contributions) {
        this.contributions = contributions;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getContributionsId() {
        return contributionsId;
    }

    public void setContributionsId(int contributionsId) {
        this.contributionsId = contributionsId;
    }
}
