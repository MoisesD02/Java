package Laboratorio1;

public class EmpleadoO {
    private String nombre;
    private String direccion;
    private String sexo;
    private int antiguedad;
    private int edad;

    public EmpleadoO(String nombre, String direccion, String sexo, int antiguedad, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.sexo = sexo;
        this.antiguedad = antiguedad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getEdad() {
        return edad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String toString() {
        return nombre + "\t" + direccion + "\t" + sexo + "\t" + antiguedad + "\t" + edad + "\n";
    }
}
