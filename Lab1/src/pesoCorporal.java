import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class pesoCorporal {
	public static void main(String args[]) {
		
		double libras, kilogramos;
		
		DecimalFormat ft = new DecimalFormat("0.00");
		
			libras = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso en libras"));
		
			kilogramos = libras * 0.453;
		
			JOptionPane.showMessageDialog(null,"El peso en kilogramos es: " + ft.format(kilogramos) + "Kg");
			System.exit(0);		
	}

}