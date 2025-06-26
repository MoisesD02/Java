import javax.swing.*;
public class Estudiantes {
	public static void main(String args[]) {
		int n, longitud;
		String nombre, histograma = "Nombre completo \t Longitud \t Histograma\n";
		
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de estudiantes"));
			for(int i = 1; i <= n; i++) 
			{
				nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante " +i);
				longitud = nombre.length();
				
				histograma  += nombre + "\t" + longitud + "\t";
				
				for(int k = 1; k <= longitud; k++) {
						
					
					histograma += "*";			
				}
				
				histograma += "\n";
				
			}
			
			JTextArea imp = new JTextArea();
			imp.setText(histograma);
			JOptionPane.showMessageDialog(null, imp);
				System.exit(0);
				
	} //main

} 
