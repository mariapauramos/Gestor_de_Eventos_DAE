/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.businessdevelop.pocguieventos.controller;

import com.businessdevelop.pocguieventos.model.Estadio;
import com.businessdevelop.pocguieventos.view.ICambioList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mariaramos
 */
public class ServicioEstadio implements IServicioEstadio {
    private static ServicioEstadio servicioEstadio;
    private String estadio;
    private List<Estadio> estadios = new ArrayList<>();
    private List<ICambioList> ventanasCambio = new ArrayList<>();
    
    private ServicioEstadio(){
    }

    public static ServicioEstadio getInstance() {
        if (servicioEstadio == null) {
            servicioEstadio = new ServicioEstadio();
        }
        return servicioEstadio;
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
    //CRUD
    @Override
    public void createEstadio(Estadio estadio) {
        estadios.add(estadio);
        huboCambioList();
        
    }

    @Override
    public Estadio searchEstadio(String idEstadio) {
        if (idEstadio == null || idEstadio.trim().isEmpty()) {
        return null;
        }
         
        for (Estadio e : estadios){
            if(e.getIdEstadio().trim().equalsIgnoreCase(idEstadio.trim())){
            return e;
            }     
        }
        return null;
    }
    
      @Override
    public Estadio updateEstadio(Estadio estadio) {
        Estadio e = searchEstadio(estadio.getIdEstadio());
        if (e!=null){
            estadios.remove(e);
            estadios.add(estadio);
            huboCambioList();
            return estadio;
            
        }
        return null;
    }
 
    @Override
    public List<Estadio> listEstadio() {
        return Collections.unmodifiableList(estadios);
    }

    @Override
    public boolean deleteEstadio(String idEstadio) {
        Estadio e = searchEstadio(idEstadio);
        if (e !=null){
            estadios.remove(e);
            huboCambioList();
            return true;
        }
       return false;
    }
    
}
