import javax.swing.*;
import java.text.DecimalFormat;
public class AreaLong {
	public static void main(String args[])
	{
		circulo t = new circulo();
		DecimalFormat ft = new DecimalFormat("00");
		int radio,n;
		String sal = "Radio\tArea\tLongitud\n";
		
		n =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de circulos: "));
		
		for(int i = 0; i < n; i ++)
		{
			radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio: "));
			
			t.rad(radio);
			
			sal += radio + "\t" + ft.format(t.calculoA()) + "\t" + ft.format(t.calculoC()) + "\n";
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
	}
}
