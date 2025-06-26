import javax.swing.*;
public class burbujaSenhal {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud del arreglo:\n"));
		int v[] = new int[tam];
		String sal = "Arreglo desordenado\n";
		
		for(int i = 0; i < tam; i++)
		{
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero en la posicion [" + i + "]"));
			
			for(int k = (i - 1); k >= 0; k--)
			{
				while(v[k] == v[i])
				{
					v[k] = Integer.parseInt(JOptionPane.showInputDialog("Numero repetido en la posicion [" + i + "] Ingresa otro numero\n"));
				}
			}
			
			sal += v[i] + " ";			
		}
		
		sal += "\n Arreglo Ordenado\n";
		burbujaS(v, tam);
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
	
	public static void burbujaS(int v[], int tam)
	{
		int i = 1, temp;
		boolean band = false;
		
		while((i < tam) && (band == false))
		{
			band = true;
			
			for(int j = 0; j < tam - 1; j++)
			{
				if(v[j] > v[j + 1])
				{
					temp = v[j];
					v[j] = v[j + 1];
					v[j + 1] = temp;
					band = false;
				}
			}
		}
		
	}
}
