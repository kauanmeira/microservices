package com.kauanmeira.hrworker.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private Double dailyIncome;


    public Worker() {

    }

    public Worker(Long id, String name, Double dailyIncome) {
        this.id = id;
        Name = name;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }
}
