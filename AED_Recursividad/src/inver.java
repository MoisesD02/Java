


import javax.swing.*;

public class inver {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
		int numero[] = new int[n];
		
		String sal = "Orden original: ";
		
		for(int i = 0; i < n; i++) 
		{
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + i));
			
			sal += numero[i] + "\t"; 
			
		}
		
		sal += "\nOrden inverso: ";
		
		sal = OrdenInv(numero,n-1,sal);
		
		JTextArea imp = new JTextArea(); imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
		
	}

	private static String OrdenInv(int[] numero, int i, String sal) 
	{		
	
		if(i >= 0) 
		{
			sal += numero[i] + "\t";
			return OrdenInv(numero, i-1, sal);		
		}
		else 
		{
			return sal;
		}	
	}
}