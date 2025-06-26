import javax.swing.*;
public class convertir {
	public static void main(String args[])
	{
		String frase, mayuscula, reemplazo, sal = "Frase en mayusculas \t Longitud \t Primer caracter \t Posicion primera A \t Letras e = puntos(.)\n";
		char primerC;
		int longitud, primeraA;
		
		
		frase = JOptionPane.showInputDialog("Ingresa una frase");
		
		longitud = frase.length();
		mayuscula = frase.toUpperCase();
		primerC = frase.charAt(0);
		primeraA = frase.indexOf('a');
		reemplazo =frase.replace('e', '.');
		
		sal += mayuscula + "\t" + longitud + "\t" + primerC + "\t" + primeraA + "\t" + reemplazo + "\n";
		
		
		JTextArea imp = new JTextArea();
		imp.setText(sal); 
		JOptionPane.showMessageDialog(null, imp);
			System.exit(0);

	}	
}