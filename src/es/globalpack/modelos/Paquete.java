package es.globalpack.modelos;

import es.globalpack.modelos.detalles.Direccion;

public class Paquete extends Envio implements Asegurable {
    private double volumen;

    public Paquete(String idSeguimiento, double peso, Direccion destino) {
        super(idSeguimiento, peso, destino);
        this.volumen = volumen;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = 5.0;
        if (this.peso > 5) {
            precio += (this.peso - 5) * 2.0;
        }
        if (this.volumen > 1) {
            precio += 10.0;
        }
        return precio;
    }

    @Override
    public double calcularSeguro(double valorMercancia) {
        return valorMercancia * 0.03;
    }
}