/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.businessdevelop.pocguieventos.model;


import java.time.LocalDate;
/**
/**
 *
 * @author mariaramos
 */
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

    public String getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(String idEstadio) {
        this.idEstadio = idEstadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDate getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(LocalDate fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getNumeroGradas() {
        return numeroGradas;
    }

    public void setNumeroGradas(int numeroGradas) {
        this.numeroGradas = numeroGradas;
    }

    public int getNumeroPalcosvip() {
        return numeroPalcosvip;
    }

    public void setNumeroPalcosvip(int numeroPalcosvip) {
        this.numeroPalcosvip = numeroPalcosvip;
    }
    
    
    
    @Override
    public String toString() {
        return this.nombre;  // solo devuelve el nombre del estadio
    }
    
}
