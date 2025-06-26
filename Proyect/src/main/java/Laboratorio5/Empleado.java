package Laboratorio5;

public class Empleado {
    private String nombre;
    private int numeroEmpleado;
    private double salario;

    public Empleado(String nombre, int numeroEmpleado, double salario) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public double getSalario() {
        return salario;
    }
}
