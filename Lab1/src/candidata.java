import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class candidata {
	
	public static void main(String args[]) {
		
		String nombre;
		int edad;
		float estatura;
		
		DecimalFormat ft = new DecimalFormat("0.00");
		
		nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estatura"));
		
			if(edad < 18 || estatura < 1.60) {
				JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nEstatura: " + ft.format(estatura) + "\nLo sentimos, tu solicitud fue rechazada");
			}else
				JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nEstatura: " + ft.format(estatura) + "\nFelicidades, tu solicitud fue aprobada");
	}

}