package com.insurance.application.incuranceApp.modules;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    @NotBlank(message = "Това поле не може да е празно!")
    @Size(min = 1, message = "Твърде малко въведени символи!")
    @Size(max = 255, message = "Твърде много въведени символи!")
    private String name;
    @Column(name = "phoneNumber", nullable = false)
    @NotBlank(message = "Това поле не може да е празно!")
    @Size(min = 10, message = "Твърде малко въведени символи!")
    @Size(max = 10, message = "Твърде много въведени символи!")
    private int phoneNumber;
    @Column(name = "address")
    private String address;

    public Person() {
    }

    public Person(Long id, String name, String address, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
