package Laboratorio5;

import java.util.ArrayList;

public class ListadoEmpleados {
    private ArrayList<Empleado> listaEmpleados;

    public ListadoEmpleados() {
        listaEmpleados = new ArrayList<>();
    }

    public String agregarEmpleado(Empleado empleado) {
        if (existeEmpleado(empleado.getNombre())) {
            return "Error: Ya existe un empleado con ese nombre.";
        } else {
            listaEmpleados.add(empleado);
            return "Empleado insertado correctamente.";
        }
    }
    
    public boolean existeEmpleado(String nombre) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public double calcularNominaTotal() {
        double total = 0;
        for (Empleado empleado : listaEmpleados) {
            total += empleado.getSalario();
        }
        return total;
    }
}
