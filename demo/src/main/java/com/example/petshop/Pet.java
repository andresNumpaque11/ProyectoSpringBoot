package com.example.petshop;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Pet {

    @Id
    @Column(unique = true)
    private int id;
    private String nombre;

    public Pet() {

    }

    public Pet(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

}
