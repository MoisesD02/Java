package Laboratorio5;

import java.util.ArrayList;

public class Listado {
    private ArrayList<Alumno> listaAlumnos;

    public Listado() {
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public ArrayList<Alumno> imprimirPorCarrera(String carrera) {
        ArrayList<Alumno> alumnosCarrera = new ArrayList<>();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCarrera().equalsIgnoreCase(carrera)) {
                alumnosCarrera.add(alumno);
            }
        }
        return alumnosCarrera;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
}
