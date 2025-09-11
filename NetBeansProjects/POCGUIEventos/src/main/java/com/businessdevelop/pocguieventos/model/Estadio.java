/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.businessdevelop.pocguieventos.model;


import java.time.LocalDate;
import lombok.Data;
import lombok.ToString;
/**
/**
 *
 * @author mariaramos
 */
@Data
public class Estadio {
    
    
    private String idEstadio;
    private String nombre;
    private int capacidad;
    private LocalDate fechaInauguracion;
    private String propietario;
    private int numeroGradas;
    private int numeroPalcosvip;

    public Estadio(String idEstadio,String nombre, int capacidad, LocalDate fechaInauguracion, String propietario,
            int numeroGradas, int numeroPalcosvip) {
        this.idEstadio= idEstadio;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.fechaInauguracion= fechaInauguracion;
        this.propietario= propietario;
        this.numeroGradas= numeroGradas;
        this.numeroPalcosvip= numeroPalcosvip;
    }
    
    @Override
    public String toString() {
        return this.nombre;  // solo devuelve el nombre del estadio
    }
    
}
