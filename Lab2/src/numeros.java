import javax.swing.*;
public class numeros {
	public static void main(String args[]) {
		int num, contador = 1;
		float promedio, suma = 0;
		double minimo = Double.MAX_VALUE;
	    double maximo = Double.MIN_VALUE;
	    
	    
			while(contador <= 10) {
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " + contador));
					suma += num  ;

					 if (num > maximo) 
					 {
			                maximo = num;
			         }
			            if (num < minimo) 
			            {
			                minimo = num;
			            }

			            contador++;
			        }

			         promedio = suma / 10;

			        JOptionPane.showMessageDialog(null, "Suma total: " + suma + "\nNumero máximo: " + maximo + "\nNumero minimo: " + minimo + "\nPromedio: " + promedio);
	}

}
