/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos.detalles;

/**
 *
 * @author Alejandro
 */
//Creamos la clase y sus respectivos atributos.
public class Direccion {
    private String calle;
    private String codigoPostal;
    private String ciudad;
//Creación del contructor que recibe los datos iniciales.
    public Direccion(String calle, int par, String codigoPostal){
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }
//Sobreescribimos el método toString().
    @Override
    public String toString() {
        return "Direccion " + "calle= " + calle + ", codigoPostal= " + codigoPostal + ", ciudad= " + ciudad;
    }

    public Object getCiudad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
