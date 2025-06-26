import javax.swing.*;

public class ejercicio4 {
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados a contratar: "));
		String tabla = "Nombre\tP1\tP2\tEdad\n";

		String nombre[] = new String[n];
		int puntaje1[] = new int[n];
		int puntaje2[] = new int[n];
		int edad[] = new int[n];

		for (int i = 0; i < n; i++) {
			nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1));
			puntaje1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el puntaje 1 de " + nombre[i]));
			puntaje2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el puntaje 2 de " + nombre[i]));
			edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombre[i]));

			tabla += nombre[i] + "\t" + puntaje1[i] + "\t" + puntaje2[i] + "\t" + edad[i] + "\n";

		}

		String prueba = promedio(edad, puntaje1, puntaje2, n);
		tabla += prueba;
		JTextArea imp = new JTextArea();
		imp.setText(tabla);
		JOptionPane.showMessageDialog(null, imp);
	}

	public static String promedio(int edad[], int puntaje1[], int puntaje2[], int n) {

		String sal = " ";
		int PM = 0;
		int contratados = 0;
		double promedio = 0;
		for (int i = 0; i < n; i++) {
			if (edad[i] >= 30) {
				puntaje1[i] += puntaje2[i] + 5;
			} else {
				PM = puntaje1[i] += puntaje2[i] + 2;
			}
		}

		for (int j = 0; j < n; j++) {
			promedio = (puntaje1[j] + puntaje2[j]) / 2.0;

			if (promedio >= 75) {
				contratados++;
			} else {
				contratados = contratados + 0;

			}

		}
		sal += "Puntajes modificados: " + PM + "\tPromedio: " + promedio + "\nSe contrataron : " + contratados
				+ " personas";

		return sal;
	}
}