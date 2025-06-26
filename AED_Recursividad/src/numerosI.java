import javax.swing.*;
public class numerosI {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud"));
		int v[] = new int[tam];
		String sal = " ";
		
		sal += "Orden original: ";
		for (int i = 0; i < tam; i++)
		{
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero en la posicion [" + i + "] "));
			sal += v[i] + " ";
		}
		
		sal += "\nOrden inverso: ";
		
		sal = ordenI(v,tam - 1,sal);
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		imp.setEditable(false);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
	}
	
	public static String ordenI(int v[], int i, String sal)
	{
		if (i >= 0)
		{
			sal += v[i] + " ";
			return ordenI(v, i-1, sal);
		}
		else
		{
			return sal;
		}
		
	}

}
