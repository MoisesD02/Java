import javax.swing.*;
public class seleccion {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud del arreglo:"));
		int v[] = new int[tam];
		String sal = "Arreglo desordenado\n";
		
		for(int i = 0; i < tam; i++)
		{
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero en la posicion [" + i + "]"));
			
			for (int k = (i - 1); k >= 0; k--)
			{
				while(v[k] == v[i])
				{
					v[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero existente, ingresa otro numero\n"));
				}
			}
			
			sal += v[i] + " ";
		}
		
		sal += "\nArreglo Ordenado\n";
		selec(v, tam);
		for (int i = 0; i < tam; i++)
		{
			sal += v[i] + " ";
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		System.exit(0);
		
	}
	
	public static void selec(int v[], int tam)
	{
		int k, menor;
		
		for (int i = 0; i < tam; i++)
		{
			menor = v[i];
			k = i;
			
			for (int j = (i + 1); j < tam; j++)
			{
				if(v[j] < menor)
				{
					menor = v[j];
					k = j;
				}
			}
			
			v[k] = v[i];
			v[i] = menor;
		}
	}

}
