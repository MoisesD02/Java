import javax.swing.*;
public class ejercicio2 {
	public static void main(String args[]) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de la matriz: "));
		String sal = "Matriz: \n";
		int matriz[][] = new int [n][n];
		
		for(int i = 0; i < n; i ++)
		{
			for(int j = 0; j < n; j ++)
			{
				int valor = 0;
				do 
				{
					valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el elemento: " + (i)  + "," + (j) + "entre 0 y 5"));
		
				}while(valor < 0 || valor > 5);
				matriz[i][j] = valor;
				sal += matriz[i][j] + "\t";
			}
			
			sal += "\n";
		}
		
		sal += calcular(matriz,n);
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
}
	
public static String calcular(int matriz[][], int n)
{
	int sumaFilas[] = new int[n];
	int sumaC[] = new int[n];
	int Cceros = 0;
	String sal = "\nTotal V.Filas \t\t Total v.Columnas\n";
	
		for(int i = 0; i < n; i ++)
		{
			for(int j = 0; j < n; j ++)
			{
				sumaFilas[i] += matriz[i][j];
				sumaC[j] += matriz[i][j];
				
				if(matriz[i][j] == 0)
				{
					Cceros ++;
				}
			}
		}
		
		for(int i = 0; i < n; i ++)
		{
			sal += sumaFilas[i] + "\t";
		}

		for(int j = 0; j < n; j ++)
		{
			sal += sumaC[j] + "\t";
		}
		
		sal += "\nLa matriz tiene: " + Cceros + " Cero.";
		return sal;
}

}
	
