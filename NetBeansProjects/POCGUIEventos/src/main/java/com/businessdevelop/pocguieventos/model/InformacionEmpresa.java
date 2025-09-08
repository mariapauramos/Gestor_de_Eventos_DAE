/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.businessdevelop.pocguieventos.model;

import lombok.Data;
import lombok.ToString;
/**
 *
 * @author mariaramos
 */
@Data
@ToString
public class InformacionEmpresa {
    // Variable estática para la única instancia
    private static InformacionEmpresa informacionEmpresa;
    
    // Información de la empresa
    private String nombreEmpresa;
    private String direccion;
    private String telefono;
    private String email;
    private String nit;
    private String version;
    private int cantidadEmpleados;
    private double ventasAnuales;
    
    private InformacionEmpresa(String nombreEmpresa, String direccion, String telefono, String email, 
            String nit, String version, int cantidadEmpleados, double ventasAnuales){
    
        this.nombreEmpresa= nombreEmpresa;
        this.direccion= direccion;
        this.telefono=telefono;
        this.email=email;
        this.nit=nit;
        this.version=version;
        this.cantidadEmpleados= cantidadEmpleados;
        this.ventasAnuales=ventasAnuales;
    }
    
    public String getVersion() {
    return version;
    }

                              
    public synchronized static InformacionEmpresa getInstance() {
        
        if (informacionEmpresa == null) {
            informacionEmpresa = new InformacionEmpresa(
                    "Business Develop Solutions",
                    "Carrera 22 # 67-39 Ibagué - Tolima",
                    "+57 8 2709400",
                    "info@businessdevelop.com",
                    "900.123.456-7",
                    "1.0.0",
                    150,
                    2.5e9
            );
        }
        return informacionEmpresa;
    }
    
    public String obtenerInformacionCompleta() {
        StringBuilder info = new StringBuilder();
        info.append("   INFORMACIÓN DE LA EMPRESA    \n");
        info.append("Nombre: ").append(nombreEmpresa).append("\n");
        info.append("NIT: ").append(nit).append("\n");
        info.append("Dirección: ").append(direccion).append("\n");
        info.append("Teléfono: ").append(telefono).append("\n");
        info.append("Email: ").append(email).append("\n");
        info.append("Empleados: ").append(cantidadEmpleados).append("\n");
        info.append("Ventas Anuales: $").append(String.format("%,.2f", ventasAnuales)).append("\n");
        info.append("Versión del Sistema: ").append(version).append("\n");
        return info.toString();
    }

    
    
}
