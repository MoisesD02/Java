import javax.swing.*;
public class Burbuja {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud del arreglo"));
		int v[] = new int[tam];
		String sal = "Arreglo desordenado\n";
		
		for (int i = 0; i < tam; i++)
		{
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero en la posicion [" + i + "]"));
			
			for (int k = (i -1); k >= 0; k--)
			{
				while(v[k] == v[i])
				{
					v[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero repetido en la posicion [" + i + "] Ingresa otro numero\n"));
				}
			}
			
			sal += v[i] + " ";
		}
		
		sal += "\nArreglo ordenado\n";
		burbuja(v, tam);
		for(int i = 0; i < tam; i++)
		{
			sal += v[i] + " ";
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		System.exit(0);
	}
	
	public static void burbuja(int v[], int tam)
	{
		int temp;
		for (int i = 0; i < tam - 1; i++)
		{
			for(int k = 0; k < tam -1; k++)
			{
				if(v[k] > v[k + 1])
				{
					temp = v[k];
					v[k] = v[k + 1];
					v[k + 1] = temp;
				}
			}
		}
	}

}
