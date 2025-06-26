import javax.swing.*;
public class ejercicio4 {
	public static void main(String args[]) {
		int n = 3;
		String nombres[] = new String[n];
		int ventas[][] = new int[n][n];
		String tabla =	"Empresas\t\tventas\t\tVentas Totales\n";
		tabla += "\tMes1\tMes2\tMes3\n";

		
		for(int i = 0; i < n; i ++)
		{
			nombres[i] = JOptionPane.showInputDialog("Ingresa el nombre de la empresa: " + (i + 1));
						
				for(int j = 0; j < n; j ++)
				{
					ventas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las ventas del mes " + (j + 1) + " en la empresa: " + (nombres[i])));
				}	
		}
		
	tabla += totalE(ventas,nombres,n);
	tabla += Spromedio(ventas,n);
	tabla += Vmensuales(ventas,n);
	
	JTextArea imp = new JTextArea();
	imp.setText(tabla);
	JOptionPane.showMessageDialog(null,imp);

}
	
public static String totalE(int ventas[][],String nombres[], int n)
{
	String tabla = "";
	int Vtotal[] = new int[n];
	
		for(int i = 0; i < n; i ++)
		{
			
			tabla += nombres[i] + "\t";

			
			for(int j = 0; j < n; j ++)
				

			{
				tabla += ventas[i][j] + "\t";

				Vtotal[i] += ventas[i][j];
			}
			
			tabla += Vtotal[i] + "\n";
		}
		
	return tabla;
}

public static String Spromedio(int ventas[][], int n)
{
	String tabla = "\n Ventas promedio de cada mes: \t Ventas Mensuales: \n";
	int PtotalM[] = new int[n];
	
		for(int j = 0; j < n; j ++)
		{
			for(int i = 0; i < n; i ++)
			{
				PtotalM[j] += ventas[i][j];
			}
			
			tabla += PtotalM[j] / 3 + "\t";
		}
		
	return tabla;
}

public static String Vmensuales(int ventas[][], int n)
{
	String tabla = "";
	int VM[] = new int[n];
	
		for(int j = 0; j < n; j ++)
		{
			for(int i = 0; i < n; i ++)
			{
				VM[j] += ventas[i][j];
			}
			
			tabla += VM[j] + "\t";
		}
				
	return tabla;
}

}