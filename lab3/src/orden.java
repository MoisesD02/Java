import javax.swing.*;

public class orden {
	public static void main(String args[]) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: "));
		float Sbase[] = new float[n];
		float impuestos[] = new float[n];
		float Pneto[] = new float[n];
		float NomT = 0;

		String nombre[] = new String[n];
		int horas[] = new int[n];
		float salario[] = new float[n];
		int dependientes[] = new int[n];

		String tabla = "Nombre\tHoras trabajadas\tsalario\tdependientes\tsalario base\timpuestos\tpago neto\n";

		for (int i = 0; i < n; i++) {
			nombre[i] = JOptionPane.showInputDialog("Ingresa el nombre del empleado: " + (i + 1));
			horas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas de: " + (nombre[i])));
			salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el salario de: " + (nombre[i])));
			dependientes[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Ingresa el numero de personas que dependen de: " + (nombre[i])));

		}

		ordenamiento(n, nombre, horas, salario, dependientes);
		tabla += Metodo(nombre, tabla, salario, horas, Sbase, n, impuestos, Pneto, dependientes, NomT);

		JTextArea imp = new JTextArea();
		imp.setText(tabla);

		JOptionPane.showMessageDialog(null, imp);
		System.exit(0);
	}

	public static void ordenamiento(int n, String nombre[], int horas[], float salario[], int dependientes[]) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (nombre[j].compareTo(nombre[j + 1]) > 0) {
					String temp = nombre[j];
					nombre[j] = nombre[j + 1];
					nombre[j + 1] = temp;

					int temphoras = horas[j];
					horas[j] = horas[j + 1];
					horas[j + 1] = temphoras;

					int tempDependientes = dependientes[j];
					dependientes[j] = dependientes[j + 1];
					dependientes[j + 1] = tempDependientes;
				}
			}
		}
	}

	public static String Metodo(String nombre[], String tabla, float[] salario, int[] horas, float[] Sbase, int n,
			float[] impuestos, float[] Pneto, int[] dependientes, float NomT) {

		for (int i = 0; i < n; i++) {

			Sbase[i] = (float) (horas[i] * salario[i]);

			if (dependientes[i] <= 3) {
				Sbase[i] = (float) (-(0.20 - (dependientes[i] * 0.01) * Sbase[i]));

			} else {
				impuestos[i] = (float) (-(0.16 - (dependientes[i] * 0.01) * Sbase[i]));
			}

			Pneto[i] = Sbase[i] - impuestos[i];

			tabla += nombre[i] + "\t" + horas[i] + "\t" + salario[i] + "\t" + dependientes[i] + "\t" + Sbase[i] + "\t"
					+ impuestos[i] + "\t" + Pneto[i] + "\n";

		}

		for (int i = 0; i < n; i++) {
			NomT += Pneto[i];
		}

		tabla += "\nNomina total: " + NomT;

		return tabla;
	}

}