import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class letras {
	public static void main(String args[]) {
		String palabra, sal = "Palabra final \n";
		
		palabra = JOptionPane.showInputDialog("Ingresa una palabra");

		StringBuilder descomposicion = new StringBuilder(palabra);
		int menos = palabra.length() -1;

		
		while(menos >= 0) {
			
			descomposicion.deleteCharAt(menos);
			sal +=  descomposicion + "\n";						
			menos --;
		}
		
		JTextArea imp = new JTextArea();
		imp.setText(sal); 
		JOptionPane.showMessageDialog(null, imp);
			System.exit(0);
	}

}