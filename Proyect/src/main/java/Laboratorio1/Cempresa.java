package Laboratorio1;

public class Cempresa {
    private String nombre;
    private String telefono;
    private double saldo;
    private boolean moroso;

    public Cempresa(String nombre, String telefono, double saldo, boolean moroso) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.saldo = saldo;
        this.moroso = moroso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public Double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
       this.saldo = saldo;
    }
    
    public boolean getMoroso(){
        return moroso;
    }
    
    public void setMoroso(boolean moroso){
        this.moroso = moroso;
    }

    @Override
    public String toString() {
        String estadoMoroso = moroso ? "Moroso" : "No Moroso";
        return nombre + "\t" + telefono + "\t" + saldo + "\t" + estadoMoroso + "\n";
    }
}

