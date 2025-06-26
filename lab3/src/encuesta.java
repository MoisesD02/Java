import javax.swing.*;

public class encuesta {
	public static void main(String args[]) {
		int n, sumaEH = 0, sumaEM = 0, contadorH = 0, contadorM = 0, promH = 0, promM = 0;

		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de personas a encuestar"));

		int edad[] = new int[n];
		char sexo[] = new char[n];
		char EC[] = new char[n];

		String tabla = "Edad \t Sexo \t Estado Civil\n";

		for (int i = 0; i < n; i++) {

			edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona " + (i + 1)));
			sexo[i] = JOptionPane.showInputDialog("Ingresa el sexo F o M para la persona " + (i + 1)).toUpperCase()
					.charAt(0);
			EC[i] = JOptionPane.showInputDialog("Estado Civil S o C para la perona " + (i + 1)).toUpperCase().charAt(0);
		}

		String prueba = Calcular(edad, sexo, EC, n);
		String prueba1 = promedio(edad, sexo, sumaEH, sumaEM, contadorH, contadorM, promH, promM, n);

		tabla += prueba + prueba1;

		JTextArea imp = new JTextArea();
		imp.setText(tabla);
		JOptionPane.showMessageDialog(null, imp);
		System.exit(0);
	} // main

	public static String Calcular(int edad[], char sexo[], char EC[], int n) {

		String impresion = " ";
		int HoMC = 0, MuMC = 0;

		for (int i = 0; i < n; i++) {
			if (edad[i] > 30 && EC[i] == 'C') {
				if (sexo[i] == 'M') {
					HoMC++;

				} else if (sexo[i] == 'F') {
					MuMC++;
				}
			}
		}

		for (int j = 0; j < n; j++) {
			impresion += edad[j] + "\t" + sexo[j] + "\t" + EC[j] + "\n";
		}
		impresion += "Hombres mayores a 30 años casados: " + HoMC + "\nMujeres mayores a 30 años casadas: " + MuMC
				+ "\n";
		return impresion;
	}

	public static String promedio(int edad[], char sexo[], int sumaEH, int sumaEM, int contadorH, int contadorM,
			float promH, float promM, int n) {

		String impresion = "";

		for (int j = 0; j < n; j++) {
			if (sexo[j] == 'M') {
				sumaEH += edad[j];
				contadorH++;
			} else if (sexo[j] == 'F') {
				sumaEM += edad[j];
				contadorM++;
			}
		}

		if (contadorH == 0) {
			promM = sumaEM / contadorM;
			promH = 0;

		} else if (contadorM == 0) {
			promH = sumaEH / contadorH;
			promM = 0;
		}

		impresion += "Edad promedio en hombres: " + promH + "\nEdad promedio en mujeres: " + promM + "\n";

		return impresion;
	}
}