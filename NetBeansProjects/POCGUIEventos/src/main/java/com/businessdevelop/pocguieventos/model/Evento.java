/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.businessdevelop.pocguieventos.model;

import java.time.LocalDate;
import lombok.Data;

@Data

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
    
    public abstract double calcularValor();
        //return valorEntrada * 1.19;

    
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

