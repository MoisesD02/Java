package Laboratorio1;

public class Alumno {
    private String nombre;
    private int semestresCursados;
    private double calificacionPromedio;

    public Alumno(String nombre, int semestresCursados, double calificacionPromedio) {
        this.nombre = nombre;
        this.semestresCursados = semestresCursados;
        this.calificacionPromedio = calificacionPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestresCursados() {
        return semestresCursados;
    }

    public void setSemestresCursados(int semestresCursados) {
        this.semestresCursados = semestresCursados;
    }

    public double getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(double calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    @Override
    public String toString() {
        return nombre + "\t" + semestresCursados + "\t" + calificacionPromedio + "\n";
        
    }
}
