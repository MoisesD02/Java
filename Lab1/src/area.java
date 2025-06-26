import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class area {
	public static void main(String args[]) {
		
		double AreaL,AreaT, AreaB, radio, altura;
		
		DecimalFormat ft = new DecimalFormat("0.00");
		
		radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
		
			AreaL = 2* Math.PI * radio * altura;
			AreaB = Math.PI * Math.pow(radio, 2);
			AreaT = 2 * AreaB + AreaL;
			
			JOptionPane.showMessageDialog(null, "Area lateral:  " + ft.format(AreaL) + "\nArea total: " + ft.format(AreaT) + "\nArea de la base:  " + ft.format(AreaB));
			System.exit(0);
	}
}
