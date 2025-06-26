


import javax.swing.*;

public class espacio {

	public static void main(String[] args) {
		
		String cadena = JOptionPane.showInputDialog("Ingrese una cadena de caracteres con espacio");
		
		int lon = cadena.length();
		int i = 0;
		
		String sal = "Cadena ingresado: \n" + cadena;
		
		int contador = 0;
		contador = Espacio(cadena,lon,i,contador);
		
		sal = "\nCantidad de espacios: " + contador ;
		
		
		JTextArea imp = new JTextArea(); imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
		
	}

	private static int Espacio(String cadena,int lon, int i, int contador) {
		
		if(i < lon) 
		{
		
			if((cadena.charAt(i)) == (' ')) 
			{
			
				contador++;
			
			}
		
		return Espacio(cadena,lon,i+1, contador);
		
		}
		
		return contador;
		
		
	}

}