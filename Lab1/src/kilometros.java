import javax.swing.JOptionPane;
public class kilometros {
	public static void main(String args[]) {
		int kilometros;
		double metros, centimetros;
				
		kilometros = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una cantidad en kilometros"));
		
		metros = kilometros * 1000;
		centimetros = kilometros * 100000;
		
		JOptionPane.showMessageDialog(null, kilometros + " Kilometros equivalen a: " + "\nMetros:  " + metros + "\nCentimetros:  " + centimetros);
		System.exit(0);
	}
}
