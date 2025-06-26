import javax.swing.JOptionPane;
public class edades {
public static void main(String args[]) {
		
		int a,b,c;
		
		a= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de Pedro"));
		b= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de Juan"));
		c= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de Mario"));
		
		if(a == b && a == c) {
			JOptionPane.showMessageDialog(null,"Los 3 tienen la misma edad");
		}else if(a == b) {
			JOptionPane.showMessageDialog(null,"Pedro y juan tienen la misma edad");
		}else if(a == c) {
			JOptionPane.showMessageDialog(null,"Pedro y mario tienen la misma edad");
		}else if(b == c) {
			JOptionPane.showMessageDialog(null,"Juan y mario tienen la misma edad");
		}else
			JOptionPane.showMessageDialog(null,"Ninguno tiene la misma edad");
			
			System.exit(0);
		
	}
}

