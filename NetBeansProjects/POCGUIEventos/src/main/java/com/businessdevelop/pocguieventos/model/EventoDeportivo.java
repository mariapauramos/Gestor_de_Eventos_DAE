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
public class EventoDeportivo extends Evento{
    
    private String tipoDeporte;
    private String campeonato;
    private Estadio estadio;   //Asociación de clases con estadio

    public EventoDeportivo(String idEvento, String nombre, String ciudad, int asistentes, 
                           LocalDate fecha, double valorEntrada, String tipoDeporte, String campeonato) {
        super(idEvento,nombre,ciudad, asistentes,fecha, valorEntrada);
        
        this.tipoDeporte = tipoDeporte;
        this.campeonato = campeonato;
        this.estadio= null; //Solo usamos la asociacioón, no la pedimos en GUI
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    //Método para calcular el valor del evento para cualquier persona (valor entrada + IVA (19%))
    @Override
    public double calcularValor() {
        return getValorEntrada() * 1.19;
    }
   

    
    @Override
    public String toString() {
    return "Evento Deportivo {" +
            " idEvento=" + getIdEvento() +
            ", nombre=" + getNombre() +
            ", ciudad=" + getCiudad() +
            ", asistentes=" + getAsistentes() +
            ", fecha=" + getFecha() +
            ", valorEntrada=" + getValorEntrada() +
            ", tipoDeporte=" + getTipoDeporte() +
            ", campeonato=" + getCampeonato() +
            (estadio != null ? ", estadio=" + estadio.getNombre() : "") +
            " }";
    } 
    
}
