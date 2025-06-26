


import javax.swing.*;

public class Palinvr {

	public static void main(String[] args) {
		
		String palabra = JOptionPane.showInputDialog("Ingrese una palabra");
		palabra = palabra.toLowerCase();
		
		int i = palabra.length();
		
		String sal = "Palabra normal: "+ palabra;
		
		sal += "\nPalabra invertida: "; 
		sal = Invertir(palabra,i-1,sal);
		
		JTextArea imp = new JTextArea(); imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
	}

	public static String Invertir(String palabra, int i, String sal) {
		
		if(i >= 0) 
		{
			
			sal += palabra.charAt(i);
			
			return Invertir(palabra,i-1,sal);
			
		}else 
		{
			return sal;
		}
		
	}

}