import javax.swing.*;
public class baraja {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud del arreglo:\n"));
		int v[] = new int[tam];
		String sal = "Arreglo desordenado\n";
		
		for (int i = 0; i < tam; i++)
		{
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero en la posicion [" + i + "]"));
			
			for(int k = (i - 1); k >= 0; k--)
			{
				while(v[k] == v[i])
				{
					v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ya existe, Ingresa otro numero: "));
				}
			}
			
			sal += v[i] + " ";
		}
		
		sal+= "\nArreglo Ordenado\n";
		bajara(v, tam);
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
	
	public static void bajara(int v[], int tam)
	{
		int aux, k = 1;
		for (int i = 1; i < tam; i++)
		{
			aux = v[i];
			k = i - 1;
			while((k >= 0) && (aux < v[k]))
			{
				v[k + 1] = v[k];
				k = k -1;
			}
			
			v[k + 1] = aux;
		}
	}

}
