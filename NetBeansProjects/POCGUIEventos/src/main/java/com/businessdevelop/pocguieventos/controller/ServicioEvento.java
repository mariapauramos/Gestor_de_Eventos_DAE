/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.businessdevelop.pocguieventos.controller;

import com.businessdevelop.pocguieventos.model.Evento;
import com.businessdevelop.pocguieventos.model.EventoCultural;
import com.businessdevelop.pocguieventos.model.EventoDeportivo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mariaramos
 */
public class ServicioEvento implements IServicioEvento {
    private List<Evento> eventos = new ArrayList<>();
    
    //Método insertar/agregar evento
    @Override
    public  void createEvento(Evento event){
        eventos.add(event);
    }
    
    //Método buscar evento
    @Override
    public Evento searchEvento(String idEvento){
        
        if (idEvento == null || idEvento.trim().isEmpty()) {
        return null;
        }
         
        for (Evento e : eventos){
            if(e.getIdEvento().trim().equalsIgnoreCase(idEvento.trim())){
            return e;
            }     
        }
        return null;
    }
    
    
    //Método listar eventos
    @Override
    public List<Evento> listEventos(){
        return Collections.unmodifiableList(eventos);
    }
    
    //Método lista evento deportivo
    @Override
    public List<EventoDeportivo> listEventosDeportivos(){
        List <EventoDeportivo> eventosDeportivos = new ArrayList<>();
        for (Evento e: eventos){
            if (e instanceof EventoDeportivo){
                EventoDeportivo ed = (EventoDeportivo) e;
                eventosDeportivos.add(ed); 
            }
        }
        return eventosDeportivos;
    }
    
    
    //Método listar evento cultural
    @Override
    public List<EventoCultural> listEventosCulturales(){
        List <EventoCultural> eventosCulturales = new ArrayList<>();
        for (Evento e: eventos){
            if (e instanceof EventoCultural){
                EventoCultural ec = (EventoCultural) e;
                eventosCulturales.add(ec);  
            }
        }
        return eventosCulturales;
    }
    
    //Método eliminar evento por consulta de idEvento
    @Override
    public boolean deleteEvento(String idEvento){
        Evento e = searchEvento(idEvento);
        if (e !=null){
            eventos.remove(e);
            return true;
        }
       return false;
    }
    
    @Override
    public double calcularValorTotalEvento (String idEvento){
        Evento e = searchEvento(idEvento);
        if (e == null) {
            return 0;
        }

        int asistentes = e.getAsistentes();
        double valorTotalEvento = e.calcularValor() * asistentes;

        return valorTotalEvento;
        
    }
    
}
