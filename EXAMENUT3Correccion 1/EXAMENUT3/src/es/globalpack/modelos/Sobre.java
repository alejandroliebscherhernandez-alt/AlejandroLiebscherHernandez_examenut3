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
//Creamos la clase sobre que hereda de Envío y contiene su propio atributo lógico esAcolchado.
public class Sobre extends Envio {

    private boolean esAcolchado;
    private double precioBase = 2.0;
    private double precio = precioBase;

    public Sobre(String idSeguimiento, double peso, Direccion destino) {
        super(idSeguimiento, peso, destino);
        this.esAcolchado = esAcolchado;
    }
    
    @Override
    public double calcularPrecioFinal() {
        
        if ( esAcolchado = true){
            precioBase = precioBase + 1.5;
        };
        
        if (destino.getCiudad().equals("Las Palmas")){
            precio -= 0.5;
        }
        return precio;

    }
;
}
