/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos;

import es.globalpack.modelos.detalles.Direccion;
import java.util.Objects;

/**
 *
 * @author Alejandro
 */
//Creamos la clase abstract Envío con sus respectivos atributos.
public abstract class Envio {
    //creamos los atributos
    protected String idSeguimiento;
    protected double peso;
    protected Direccion destino;
    public String[] historialParadas = new String[3];
    
    public Envio(String idSeguimiento, double peso, Direccion destino) {
        this.idSeguimiento = idSeguimiento;
        this.peso = peso;
        this.destino = destino;
        historialParadas[0] = "Sin registro";
        historialParadas[1] = "Sin registro";
        historialParadas[2] = "Sin registro";
    }

    public abstract double calcularPrecioFinal();

    @Override
    public boolean equals(Object idSeguimiento) { 
        return this.idSeguimiento.equals(this.idSeguimiento);
    }

    public String[] getHistorialParadas() {
        return historialParadas;
    }
    
    
    
}

