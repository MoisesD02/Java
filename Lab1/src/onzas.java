import javax.swing.JOptionPane;
public class onzas {
	public static void main(String args[]){
		
		float libras, onzas, totalOnzas;
		
		libras = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de libras"));
		onzas = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de onzas"));
		
			totalOnzas = libras * 16 + onzas;
			
				JOptionPane.showMessageDialog(null,"La cantidad de onzas es de " + totalOnzas);
				
				System.exit(0);				
	}

}