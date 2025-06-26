import javax.swing.*;

public class ejercicio6 {
	public static void main(String args[]) {
		int n = 12, promedio = 0, Sprom = 0, Iprom = 0;
		String mes[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		int toneladas[] = new int[n];
		String tabla = "Meses\t Toneladas\n";

		for (int i = 0; i < n; i++) {
			toneladas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las toneladas del mes " + (mes[i])));

			tabla += mes[i] + "\t" + toneladas[i] + "\n";
		}

		tabla += "\n";

		promedio = prom(toneladas);
		Sprom = Msuperiores(toneladas, promedio, n);
		Iprom = Minferiores(toneladas, promedio, n);

		tabla += "Promedio mensual: " + promedio + "\nMeses superiores al promedio: " + Sprom
				+ " \nMeses inferiores al promedio: " + Iprom;

		JTextArea imp = new JTextArea();
		imp.setText(tabla);
		JOptionPane.showMessageDialog(null, imp);
	}

	public static int prom(int toneladas[]) {
		int prom = 0;

		for (int i = 0; i < 12; i++) {
			prom += toneladas[i];
		}

		return prom / 12;
	}

	public static int Msuperiores(int toneladas[], int promedio, int n) {
		int contadorM = 0;

		for (int i = 0; i < n; i++) {
			if (toneladas[i] > promedio) {
				contadorM++;
			}
		}
		return contadorM;
	}

	public static int Minferiores(int toneladas[], int promedio, int n) {
		int contador = 0;

		for (int i = 0; i < n; i++) {
			if (toneladas[i] < promedio) {
				contador++;
			}
		}
		return contador;
	}
}