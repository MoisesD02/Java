import javax.swing.*;
public class espacios {
	public static void main(String args[])
	{
		String palabra = JOptionPane.showInputDialog("Ingresa una palabra");
		String sal = "";
		int tam = palabra.length();
		int contador = 0;
		int i = 0;
		
		sal += "palabra Ingresada: " + palabra;
		
		contador = cantidad(palabra, tam, i, contador);
		
		sal = "cantidad de espacios " + contador;
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
	}
	
	public static int cantidad(String palabra, int tam, int i, int contador)
	{
		if(i < tam)
		{
			if ((palabra.charAt(i) == (' ')))
			{ 
				contador++;	
			}
		return cantidad(palabra, tam, i + 1, contador);
		}
		else
			return contador;
	}

}
