/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos;

import es.globalpack.modelos.detalles.Direccion;

/**
 *
 * @author Alejandro
 */
//Creacion de la clase Paquete que hereda de Envio e implementa una interfaz Asegurable.
public class Paquete extends Envio implements Asegurable {

    private double volumen;
    double precioBase = 5;
    double precio = precioBase;
    private double seguro;
    
    public Paquete(String idSeguimiento, double peso, Direccion destino, double volumen) {
        super(idSeguimiento, peso, destino);
        this.volumen = volumen;
    }

    @Override
    public double calcularPrecioFinal() {
        
        if (peso > 5.0) {
            precio += (peso - 5) * 2.0;
        }

        if (volumen > 1.0) {
            precio = precio + 10.0;
        };

        precio = precio;

        return precio;
    }
;
    
    @Override
    public double calcularSeguro(double valorMercancia){
        return seguro = (valorMercancia / 100 * 3);
    };

    public double getPrecio() {
        return precio;
    }

    public double getSeguro() {
        return seguro;
    }
    
    
}
