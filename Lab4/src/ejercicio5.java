import javax.swing.*;
public class ejercicio5 {
	public static void main(String args[]) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de Empresas: "));
		String nombre [] = new String [n];
		int ventas [][] = new int [n][3];
		String sal = "Empresas\t\tventas\n";
		sal += "\tMes1\tMes2\tMes3\n";

		
		for(int i = 0; i < n; i ++)
		{
			nombre[i] = JOptionPane.showInputDialog("Ingresa el nombre de la empresa : " + (i + 1));
			sal += nombre[i] + "\t";
				
				for(int j = 0; j < 3; j ++)
				{
					ventas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las ventas del mes " + (j + 1) + " de: " + nombre[i]));
					
				
					sal += ventas[i][j] + "\t";

				}
				sal += "\n";
		}
		
		sal += Vminimas(ventas,n);
	
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
	}
	
public static String Vminimas(int ventas[][], int n)
{
	String sal = "Ventas Minimas: \n";
	sal += "Mes1\tMes2\tMes3\n";

	int Vmin[] = new int[3];
		
		for(int j = 0; j < 3; j ++)
		{
			Vmin[j] = ventas[0][j];
		}
	
		for(int i = 0; i < n; i ++)
		{
			for(int j = 0; j < 3; j ++)
			{
				if(ventas[i][j] < Vmin[j])
				{
					Vmin[j] = ventas[i][j];
				}
				
			}
				
		}
		
		for(int j = 0; j < n; j ++)
		{
			sal += Vmin[j] + "\t";

		}
	return sal;
}
}
