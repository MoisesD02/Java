import javax.swing.*;
public class sacudida {
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
		sacu(v, tam);
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
	
	public static void sacu(int v[], int tam)
	{
		int izq = 1, der = tam -1, k = tam -1, temp;
		while(der >= izq)
		{
			for (int i = der; i >= izq; i--)
			{
				if(v[i - 1] > v[i])
				{
					temp = v[i - 1];
					v[i - 1] = v[i];
					v[i] = temp;
					k = i;	
				}
			}
			
			izq = k + 1;
			
			for(int i = izq; i <= der; i++)
			{
				if(v[i - 1] > v[i])
				{
					temp = v[i - 1];
					v[i - 1] = v[i];
					v[i] = temp;
					k = i;
				}
			}
			
			der = k - 1;
		}
	}


}
