import javax.swing.*;
public class prueba {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud"));
		int v[] = new int[tam];
		String sal = "Arreglo desordenado\n";
		
		for (int i = 0; i < tam; i++)
		{
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero en la posicion[" + i + "]"));
			
			for (int j = (i - 1); j >= 0; j--)
			{
				while(v[j] == v[i])
				{
					v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro"));
				}
			}
			
			sal += v[i] + " ";
		}
		
		sal += "\n Arreglo ordenado\n";
		shell(v,tam);
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
	
	public static void shell(int v[], int tam)
	{
		int ent = tam - 1, i, temp;
		boolean band;
		
		while(ent > 0)
		{
			ent = (int)(ent/2);
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
					i = i + 1;
				}
			}
		}
	}

}
