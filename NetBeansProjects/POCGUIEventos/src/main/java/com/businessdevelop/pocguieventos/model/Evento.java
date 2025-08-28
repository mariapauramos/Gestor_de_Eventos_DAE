/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.businessdevelop.pocguieventos.model;

import java.time.LocalDate;

/**
 *
 * @author mariaramos
 */
public  abstract class Evento {
    
   private String idEvento;
   private String nombre;
   private String ciudad;
   private int asistentes;
   private LocalDate fecha;
   private double valorEntrada;
   
   
   public Evento(String idEvento, String nombre, String ciudad, int asistentes, LocalDate fechaHora , double valorEntrada) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.ciudad=ciudad;
        this.asistentes = asistentes;
        this.fecha= fechaHora;
        this.valorEntrada = valorEntrada;
    }
   
    //Métodos getters and setters
    public String getIdEvento() {
        return idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAsistentes() {
        return asistentes;
    }
    

    public String getCiudad() {
        return ciudad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }
    
    //Método para calcular el valor del evento para cualquier persona (valor entrada + IVA (19%))
    public double calcularValor(){
        return valorEntrada * 1.19;
    }
    
    @Override
    public String toString() {
        return "Evento: " + "idEvento: " + idEvento + 
                " - " + "nombre: " + nombre +  
                " - " + "ciudad: " + ciudad + 
                " - " + "asistentes: " + asistentes + 
                " - " + "fecha: " + fecha + 
                " - " + "valor entrada: " + valorEntrada;
    }
}

