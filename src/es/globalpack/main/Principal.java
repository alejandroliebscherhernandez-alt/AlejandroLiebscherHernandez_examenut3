package es.globalpack.main; 

import es.globalpack.modelos.Paquete;
import es.globalpack.modelos.detalles.Direccion;

/**
 * @author Alejandro
 */
public class Principal {
    public static void main(String[] args) {
        double precioFinal;

        Direccion direccion1 = new Direccion("Avda. José S. Peñate", "35012", "Las Palmas");
        Paquete paquete1 = new Paquete("GP-999", 8.5, direccion1);

        paquete1.historialParadas[0] = "Madrid";
        paquete1.historialParadas[1] = "Sevilla";

        // 3. Recorrer el historial con bucle for y length
        System.out.println("Historial de paradas del envío:");
        for (int i = 0; i < paquete1.historialParadas.length; i++) {
            System.out.println("Parada " + i + ": " + paquete1.historialParadas[i]);
        }

        precioFinal = paquete1.calcularPrecioFinal();
        System.out.println("Precio final del paquete: " + precioFinal);
        System.out.println("Seguro del paquete: " + paquete1.calcularSeguro(precioFinal));
    }
}