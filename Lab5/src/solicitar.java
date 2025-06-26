import javax.swing.*;
public class solicitar {
	public static void main(String args[])
	{
		fecha t = new fecha();
		int n, dia, mes, año;
		String nombre, sal = "Nombre Completo\tFecha De Nacimiento\n";
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas:"));
		
		for(int i = 0; i < n; i ++)
		{
			nombre = JOptionPane.showInputDialog("Ingresa el nombre de la persona: " + (i + 1));
			
			dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia: "));
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
			año = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año: "));
			
			t.Asignar(dia,mes,año);
			
			sal += nombre + "\t\t" + t.formato() + "\n";
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
	}
}
