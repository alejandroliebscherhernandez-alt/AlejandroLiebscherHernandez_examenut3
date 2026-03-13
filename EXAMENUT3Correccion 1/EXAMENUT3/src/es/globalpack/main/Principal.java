/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.main;

import es.globalpack.modelos.Paquete;
import es.globalpack.modelos.detalles.Direccion;

/**
 *
 * @author Alejandro
 */
public class Principal {
    public static void main(String[] args) {
        Direccion laDireccion = new Direccion("Avda, José S. Peñate", 543522, "Madrid");
        Paquete elPaquete = new Paquete("GP-9234", 4.5, laDireccion, 2);
        
        elPaquete.historialParadas[0] = "Madrid";
        elPaquete.historialParadas[1] = "Barcelona";
        
        for(int i = 0; i < elPaquete.getHistorialParadas().length; i++) {
            System.out.println("La parada " + (i + 1) + " es " + elPaquete.getHistorialParadas()[i]);
        }
        
        elPaquete.calcularPrecioFinal();
        elPaquete.calcularSeguro(elPaquete.getPrecio());
        
        System.out.println("EL precio final del paquete es " + elPaquete.getPrecio() + " y su seguro es " + elPaquete.getSeguro());
    }
}
