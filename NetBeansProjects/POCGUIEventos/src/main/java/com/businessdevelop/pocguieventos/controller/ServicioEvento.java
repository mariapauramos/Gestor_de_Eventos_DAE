/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.businessdevelop.pocguieventos.controller;

import com.businessdevelop.pocguieventos.model.Evento;
import com.businessdevelop.pocguieventos.model.EventoCultural;
import com.businessdevelop.pocguieventos.model.EventoDeportivo;
import com.businessdevelop.pocguieventos.view.ICambioList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mariaramos
 */
public class ServicioEvento implements IServicioEvento {
    private static ServicioEvento servicioEvento;
    private String evento;
    private List<Evento> eventos = new ArrayList<>();
    private List<ICambioList> ventanasCambio = new ArrayList<>();
    
    
    private ServicioEvento(){
    }

    public static ServicioEvento getInstance() {
        if (servicioEvento == null) {
            servicioEvento = new ServicioEvento();
        }
        return servicioEvento;
    }
    
    //Metodos observer
    public void addVentana(ICambioList gui) {
        ventanasCambio.add(gui);
    }

    public void removeVentana(ICambioList gui) {
        ventanasCambio.remove(gui);
    }
    
    private void huboCambioList() {
        for (ICambioList gui : ventanasCambio) {
            System.out.println("Notificando cambio de ventana");
            gui.huboCambioList();
        }
    }
    
    
    //Método insertar/agregar evento
    @Override
    public  void createEvento(Evento event){
        eventos.add(event);
        huboCambioList();
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
    
    
    @Override
    public Evento updateEvento(Evento evento) {
        if (evento == null || evento.getIdEvento() == null) {
            return null;
        }

        Evento existente = searchEvento(evento.getIdEvento());
        if (existente != null) {
            eventos.remove(existente);
            eventos.add(evento);
            huboCambioList();
            return evento;
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
            huboCambioList();
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
