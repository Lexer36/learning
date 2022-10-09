package com.example.demo.model;

import com.example.demo.Service.SalaryService;

import java.util.Objects;

public class SalaryDTO implements SalaryService {
    private int salary;
    private int daysOff;

    public SalaryDTO(int salary, int daysOff){
        this.salary = salary;
        this.daysOff = daysOff;
    }

    public int getSalary() {
        return salary;
    }

    public int getDaysOff() {
        return daysOff;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    public int calculation() {
        return (this.salary / 29) * this.daysOff;
    }
}
