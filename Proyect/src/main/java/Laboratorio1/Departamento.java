package Laboratorio1;

public class Departamento {
    private String nombre;
    private String sexo;
    private int edad;

    public Departamento(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
       this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Sexo: " + sexo + ", Edad: " + edad + "\n";
    }
}
