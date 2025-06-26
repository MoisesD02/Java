import javax.swing.*;
public class Matriz {
	public static void main(String args[]) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de la matriz"));
		
		int matriz[][] = new int[n][n];
		String sal = "Matriz\n";
		
		for(int i = 0; i < n; i ++)
		{
			for(int j = 0; j < n; j ++)
			{
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el elemento en la posicion " +(i)  +"," +(j)));
				
				sal+=matriz[i][j]+"\t";
			}
			
			 sal+="\n";
		}
		
		sal += elementos(matriz,n) + "\n";
		sal+= "\nSuma de los Elementos encima de la Diagonal principal = " + suma(matriz,n);
		sal += Emayor(matriz,n);
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		System.exit(0);
	}
	
public static String elementos(int matriz[][], int n) 
	{
	String sal = "";
		
	sal+= "\nElementos debajo de la Diagonal inversa: ";
	
	for(int i = 0; i < n; i ++)
	{
		for(int j = 0; j < n; j++)
		{
			if(j > n - 1 - i)
			{
				sal+= matriz[i][j] + "\t";
			}
		}
	}
	
	return sal;
	}

public static int suma(int matriz[][], int n)
{
	int suma = 0;
		
	for(int i = 0; i < n; i ++)
	{
		for(int j = i + 1; j < n; j++)
		{	
			suma += matriz[i][j];
		}
	}	
	return suma;
}

public static String Emayor(int matriz[][], int n)
{	
	String sal = "";
	int max = matriz[0][0];
	int posx = 0;
	int posy = 0;
	
	for(int i = 0; i < n; i ++)
	{
		for(int j = 0; j < n; j++)
		{	
			if(matriz[i][j] > max)
			{
				max = matriz[i][j];
				posx = i;
				posy = j;
			}
		}
	}
	sal += "\n\nElemeto mayor de la matriz: " + max + "\n\nSe encuentra en la posicion: [" + posx + "][" + posy + "]";
			
	return sal;
}
}