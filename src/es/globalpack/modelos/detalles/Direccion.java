package es.globalpack.modelos.detalles;

public class Direccion {
    // Atributos privados [cite: 26]
    private String calle;
    private String codigoPostal;
    private String ciudad;

    // Constructor completo [cite: 27]
    public Direccion(String calle, String codigoPostal, String ciudad) {
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    // Método necesario para la lógica del Sobre [cite: 49]
    public String getCiudad() {
        return ciudad;
    }

    // Sobrescritura de toString() [cite: 27]
    @Override
    public String toString() {
        return "Dirección: " + calle + ", CP: " + codigoPostal + ", Ciudad: " + ciudad;
    }
}