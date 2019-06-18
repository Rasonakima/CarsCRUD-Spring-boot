package com.example.carscrud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String name;

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

    public Car() {
        super();
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + "]";
    }
}