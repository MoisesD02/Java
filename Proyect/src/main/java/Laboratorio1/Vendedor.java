package Laboratorio1;

public class Vendedor {
    private String nombre;
    private double Vtotales;
    String sal = "Nombre\tVentas Totales";

    public Vendedor(String nombre, double Vtotales) {
        this.nombre = nombre;
        this.Vtotales = Vtotales;
    }

    public String getNombre() {
        return nombre;
    }


    public double getVtotales() {
        return Vtotales;
    }


    public void setVtotales(double Vtotales) {
        this.Vtotales = Vtotales;
    }

    public String toString() {
        return sal + "\n" + nombre + "\t" + Vtotales + "\n";
    }
}
