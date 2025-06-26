import javax.swing.*;

public class ultimo {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empresas a evaluar"));
		
		String nombres[] = new String[n];
		
		int ventas[][] = new int[n][3];
		
		String sal = "Empresa\t\tVentas\n";
		
		for(int i = 0; i < n; i++) {
			
			nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre de la empresa "+(i+1));
			
			 for (int j = 0; j < 3; j++) {
				 
	                ventas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes " + (j + 1) + " para " + nombres[i] + ":"));

			 }
			
		}
		
		
		
		for(int i = 0; i < n; i++) {
			
			sal += nombres[i];
			
			for(int j = 0; j < 3; j++) {
			
				sal += "\t"+ventas[i][j];
			
			}
			sal += "\n";
		}
		
		sal += Ventas_minimas(ventas,n);
		
		JTextArea imp = new JTextArea();imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
		
}

	public static String Ventas_minimas(int[][] ventas, int n) {
		
		String mens = "\nVentas Minimas: \n";
		mens += "Mes1\tMes2\tMes3\n";

		
		int[] min = new int[3];
		
		
		
		for(int j = 0; j < 3; j++) {
			
			min[j] = ventas[0][j];
		}
		
		
		for(int j = 0; j < 3; j++) {
			
		
			for(int i = 0; i < n; i++) {
				
				if(ventas[i][j] < min[j]) {
					
					min[j] = ventas[i][j];
				
				}
				
			}
			mens += min[j] + "\t";
		}
		
		return mens;
		
	}

}