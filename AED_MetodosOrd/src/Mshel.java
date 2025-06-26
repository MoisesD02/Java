import javax.swing.*;
public class Mshel {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud del arreglo: "));
		int v[] = new int[tam];
		String sal = "Arreglo desordenado:\n ";
		
		for (int i = 0; i < tam; i++)
		{
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero en la posicion [" + i + "]"));
			
			for (int k = (i - 1); k >= 0; k--)		
			{
				while(v[k] == v[i])
					v[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento repetido en pos" + (i + 1) + "Ingresa otro numero:"));
			}
			
			sal += v[i] + " ";
			
		}
		
		sal += "\n Arreglo Ordenado\n";
		Mshell(v, tam);
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
	
public static void Mshell(int v[], int tam)
{
	int ent = tam + 1, i, temp;
	boolean band = false;
	while(ent > 0)
	{
		ent = (int)(ent / 2);
		band = true;
		while(band == true)
		{
			band = false;
			i = 0;
			while((i + ent) < tam)
			{
				if(v[i] > v[i + ent])
				{
					temp = v[i];
					v[i] = v[i + ent];
					v[i + ent] = temp;
					band = true;
				}
				
				i++;
			}
		}
	}
	
}	
}
