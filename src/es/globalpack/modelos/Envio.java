package es.globalpack.modelos;

import es.globalpack.modelos.detalles.Direccion;
import java.util.Objects;

public abstract class Envio {
    // Atributos protegidos (accesibles por clases hijas) [cite: 30]
    protected String idSeguimiento;
    protected double peso;
    protected Direccion destino;
    
    // Atributo con nivel de acceso para ser manipulado en Main [cite: 31, 56]
    public String[] historialParadas;

    // Constructor [cite: 32]
    public Envio(String idSeguimiento, double peso, Direccion destino) {
        this.idSeguimiento = idSeguimiento;
        this.peso = peso;
        this.destino = destino;
        this.historialParadas = new String[3];
        // Inicialización del array [cite: 32]
        for (int i = 0; i < historialParadas.length; i++) {
            historialParadas[i] = "Sin registro";
        }
    }

    // Método abstracto [cite: 33]
    public abstract double calcularPrecioFinal();

    // Sobrescritura de equals por idSeguimiento [cite: 52]
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Envio envio = (Envio) obj;
        return Objects.equals(idSeguimiento, envio.idSeguimiento);
    }
}