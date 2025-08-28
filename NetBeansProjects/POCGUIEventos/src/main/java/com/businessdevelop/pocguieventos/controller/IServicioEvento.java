/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.businessdevelop.pocguieventos.controller;

import com.businessdevelop.pocguieventos.model.Evento;
import com.businessdevelop.pocguieventos.model.EventoCultural;
import com.businessdevelop.pocguieventos.model.EventoDeportivo;
import java.util.List;

/**
 *
 * @author mariaramos
 */
public interface IServicioEvento {
    
    public void createEvento (Evento event);
    public Evento searchEvento (String idEvento);
    public List<Evento> listEventos();
    public List<EventoDeportivo> listEventosDeportivos();
    public List<EventoCultural> listEventosCulturales();
    public boolean deleteEvento (String idEvento);
    public double calcularValorTotalEvento (String idEvento);
    
    
    
}
