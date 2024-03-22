/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1_8_doctor;

/**
 *
 * @author KonGo
 */
public class Doctor {
    
    private String fullName;
    private String specialty;
    private int number;
    private int shifts;
    private boolean certification;

    public Doctor(String fullName, String specialty, int number, int shifts, boolean certification) {
        this.fullName = fullName;
        this.specialty = specialty;
        this.number = number;
        this.shifts = shifts;
        this.certification = certification;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getShifts() {
        return shifts;
    }

    public void setShifts(int shifts) {
        this.shifts = shifts;
    }

    public boolean isCertification() {
        return certification;
    }

    public void setCertification(boolean certification) {
        this.certification = certification;
    }

        
}
