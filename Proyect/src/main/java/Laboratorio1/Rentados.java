package Laboratorio1;

public class Rentados {
    private String direccion;
    private double extension;
    private double precio;
    String sal = "Ubicación\tExtensión\tPrecio\n";

    public Rentados(String direccion, double extension, double precio) {
        this.direccion = direccion;
        this.extension = extension;
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return sal + direccion + "\t" + extension + " m²\t" + precio + "\n";
    }
}
