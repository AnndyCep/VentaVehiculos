package com.mycompany.ventaautomoviles.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atomovil implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_automovil;
    
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String placa;
    private String cantidad_puertas;

    public Atomovil() {
    }

    public Atomovil(int id_automovil, String modelo, String marca, String motor, String color, String placa, String cantidad_puertas) {
        this.id_automovil = id_automovil;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.placa = placa;
        this.cantidad_puertas = cantidad_puertas;
    }

    public int getId_automovil() {
        return id_automovil;
    }

    public void setId_automovil(int id_automovil) {
        this.id_automovil = id_automovil;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCantidad_puertas() {
        return cantidad_puertas;
    }

    public void setCantidad_puertas(String cantidad_puertas) {
        this.cantidad_puertas = cantidad_puertas;
    }

    @Override
    public String toString() {
        return "Atomovil{" + "id_automovil=" + id_automovil + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + ", color=" + color + ", placa=" + placa + ", cantidad_puertas=" + cantidad_puertas + '}';
    }
    
    
}
