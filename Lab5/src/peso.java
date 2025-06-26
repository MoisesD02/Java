import javax.swing.*;
import java.text.DecimalFormat;
public class peso {
	public static void main(String args[])
	{
		DecimalFormat ft = new DecimalFormat("00");
		
		ejercicio1 t = new ejercicio1();
		int n; 
		float kilos;
		String nombre, sal = "Nombre Completo\tPeso en KG\tPeso en LB\n";
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas:"));
		
		for(int i = 0; i < n; i ++)
		{
			nombre = JOptionPane.showInputDialog("Ingresa el nombre de la persona " + (i + 1));
			
			kilos = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el peso en KILOGRAMOS de: " + nombre));
			
			t.SetPeso(kilos);
			
			sal += nombre + "\t\t" + ft.format(t.GetPeso()) + "\t" + ft.format(t.conversion()) + "\n";
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
	}

}
