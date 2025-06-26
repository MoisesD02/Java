import javax.swing.*;

public class profesores {
	public static void main(String args[]) {
		int n, prom = 0;

		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de profesores"));

		String nombre[] = new String[n];
		String sexo[] = new String[n];
		int edad[] = new int[n];

		String tabla = "Nombre \t Sexo \t Edad\n";

		for (int i = 0; i < n; i++) {

			nombre[i] = JOptionPane.showInputDialog("Ingresa el nombre del profesor " + (i + 1));
			sexo[i] = JOptionPane.showInputDialog("Ingresa el sexo F o M del profesor " + (nombre[i]));
			edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del profesor " + (nombre[i])));
		}

		String impresion = tabla(nombre, sexo, edad, n);
		int Epromedio = Promedio(edad, prom, n);
		String JP = Calculo(edad, nombre, n);
		String sal = Promedio(edad, nombre, Epromedio, n);

		tabla += impresion + "\nLa edad promedio de todos los profesores es de: " + Epromedio
				+ "\nEl profesor mas joven del grupo es: " + JP + sal;

		JTextArea imp = new JTextArea();
		imp.setText(tabla);
		JOptionPane.showMessageDialog(null, imp);
		System.exit(0);
	}

	public static String tabla(String nombre[], String sexo[], int edad[], int n) {

		String impresion = " ";

		for (int j = 0; j < n; j++) {
			impresion += nombre[j] + "\t" + sexo[j] + "\t" + edad[j] + "\n";
		}
		return impresion;
	}

	public static int Promedio(int edad[], int prom, int n) {
		// int prom = 0;

		for (int i = 0; i < n; i++) {
			prom += edad[i];
		}

		return prom / n;
	}

	public static String Calculo(int edad[], String nombre[], int n) {
		int Emin = Integer.MAX_VALUE;
		String Pjoven = " ";

		for (int i = 0; i < n; i++) {
			if (edad[i] < Emin) {
				Emin = edad[i];
				Pjoven = nombre[i];
			} else if (edad[i] == Emin) {
				Pjoven += ", " + nombre[i];
			}
		}

		return Pjoven;

	}

	public static String Promedio(int edad[], String nombre[], int Epromedio, int n) {
		String impresion = " ";
		int Mprom = 0;
		String PMP = " ";

		for (int i = 0; i < n; i++) {
			if (edad[i] > Epromedio) {
				Mprom++;
				PMP += nombre[i] + "\n";
			}
		}

		impresion += "\n" + Mprom + "Profesores mayores al promedio y son: " + "\n" + PMP;
		return impresion;

	}
}