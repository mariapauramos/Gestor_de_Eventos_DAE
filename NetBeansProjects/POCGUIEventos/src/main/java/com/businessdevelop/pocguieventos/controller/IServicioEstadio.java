/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.businessdevelop.pocguieventos.controller;

import com.businessdevelop.pocguieventos.model.Estadio;
import java.util.List;

/**
 *
 * @author mariaramos
 */
public interface IServicioEstadio {
    
    public void createEstadio (Estadio estadio);
    public Estadio searchEstadio (String idEstadio);
    public Estadio updateEstadio (Estadio estadio);
    public List<Estadio> listEstadio();
    public boolean deleteEstadio (String idEstadio);
}
