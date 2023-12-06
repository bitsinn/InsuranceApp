package com.insurance.application.incuranceApp.modules;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Contributions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Това поле не може да е празно!")
    @Size(max = 10)
    private int firstContribution;
    @NotBlank(message = "Това поле не може да е празно!")
    @Size(max = 10)
    private int secondContribution;
    @NotBlank(message = "Това поле не може да е празно!")
    @Size(max = 10)
    private int thirdContribution;
    @NotBlank(message = "Това поле не може да е празно!")
    @Size(max = 10)
    private int forthContribution;
    private int finalPayment;

    public Contributions() {
    }

    public Contributions(Long id, int firstContribution, int secondContribution, int thirdContribution, int forthContribution, int finalPayment) {
        this.id = id;
        this.firstContribution = firstContribution;
        this.secondContribution = secondContribution;
        this.thirdContribution = thirdContribution;
        this.forthContribution = forthContribution;
        this.finalPayment = finalPayment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFirstContribution() {
        return firstContribution;
    }

    public void setFirstContribution(int firstContribution) {
        this.firstContribution = firstContribution;
    }

    public int getSecondContribution() {
        return secondContribution;
    }

    public void setSecondContribution(int secondContribution) {
        this.secondContribution = secondContribution;
    }

    public int getThirdContribution() {
        return thirdContribution;
    }

    public void setThirdContribution(int thirdContribution) {
        this.thirdContribution = thirdContribution;
    }

    public int getForthContribution() {
        return forthContribution;
    }

    public void setForthContribution(int forthContribution) {
        this.forthContribution = forthContribution;
    }

    public int getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(int finalPayment) {
        this.finalPayment = finalPayment;
    }
}
