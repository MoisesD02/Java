import javax.swing.*;

public class Banco {
	public static void main(String args[]) {
		int n, opcion;

		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de clientes: "));

		String nombres[] = new String[n];
		String Ncuenta[] = new String[n];
		Double saldo[] = new Double[n];

		for (int i = 0; i < n; i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingresa el nombre del cliente: " + (i + 1));
			Ncuenta[i] = JOptionPane.showInputDialog("Ingresa el numero de cuenta del cliente: " + nombres[i]);
			saldo[i] = Double.parseDouble(
					JOptionPane.showInputDialog("Ingresa el saldo que hay en la cuenta de: " + nombres[i]));
		}

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Transacciones:\n"
					+ "1. Imprimir todos los registros.\n" + "2. Datos de una persona conforme al numero de cuenta.\n"
					+ "3. Realizar deposito.\n" + "4. Realizar retiro.\n" + "5. Salir."));

			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
			}

		} while (opcion != 5);
	}
}
