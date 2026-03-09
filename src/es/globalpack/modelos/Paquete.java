package es.globalpack.modelos;

import es.globalpack.modelos.detalles.Direccion;

public class Paquete extends Envio implements Asegurable {
    private double volumen; // Atributo propio [cite: 36]

    public Paquete(String idSeguimiento, double peso, Direccion destino, double volumen) {
        super(idSeguimiento, peso, destino); // Llamada al constructor base [cite: 35]
        this.volumen = volumen;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = 5.0; // Precio base [cite: 42]
        // Lógica por peso extra [cite: 43]
        if (this.peso > 5) {
            precio += (this.peso - 5) * 2.0;
        }
        // Lógica por volumen [cite: 44]
        if (this.volumen > 1) {
            precio += 10.0;
        }
        return precio;
    }

    @Override
    public double calcularSeguro(double valorMercancia) {
        return valorMercancia * 0.03; // Seguro del 3% [cite: 51]
    }
}