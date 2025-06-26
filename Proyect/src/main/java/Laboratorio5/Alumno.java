package Laboratorio5;

public class Alumno {
    private String nombre;
    private String carrera;
    private String carnet;

    public Alumno(String nombre, String carrera, String carnet) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }


    public String getCarnet() {
        return carnet;
    }

}
