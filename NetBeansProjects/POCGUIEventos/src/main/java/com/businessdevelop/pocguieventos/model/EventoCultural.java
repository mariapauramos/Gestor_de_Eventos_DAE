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
public class EventoCultural extends Evento implements IEsFolclorico {
    
    private String tipoCultura;
    private String artistaPrincipal;

    public EventoCultural(String idEvento,String nombre, String ciudad, int asistentes, LocalDate fecha, double valorEntrada,
                          String tipoCultura, String artistaPrincipal) {
        super(idEvento, nombre, ciudad, asistentes, fecha, valorEntrada);
        this.tipoCultura = tipoCultura;
        this.artistaPrincipal = artistaPrincipal;
    }

    public String getTipoCultura() {
        return tipoCultura;
    }

    public void setTipoCultura(String tipoCultura) {
        this.tipoCultura = tipoCultura;
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(String artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }
    
    //Método para calcular el valor del evento para cualquier persona (valor entrada + IVA (19%))
   @Override
    public double calcularValor() {
        return getValorEntrada() * 1.19;
    }
    
    @Override
    public String toString() {
        return "Evento Cultural -> " +
               "ID: " + getIdEvento() + 
               ", Nombre: " + getNombre() + 
               ", Ciudad: " + getCiudad() +
               ", Asistentes: " + getAsistentes() +
               ", Fecha: " + getFecha() +
               ", Valor Entrada: " + getValorEntrada() +
               ", Tipo Cultura: " + getTipoCultura() +
               ", Artista Principal: " + getArtistaPrincipal();
    }
    
    @Override
    public boolean esTipoFolclorico(){
        return tipoCultura != null && tipoCultura.equalsIgnoreCase("Folclórico");
    }
    
}
