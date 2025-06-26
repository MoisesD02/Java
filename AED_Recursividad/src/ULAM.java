


import javax.swing.*;

public class ULAM {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para resolver la secuencia ULAM "));
		
		String sal = "";
		
		sal = Secuencia(n,sal);
		
		JTextArea imp = new JTextArea(); imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
		
	}

	private static String Secuencia(int n, String sal) {
		
		if(n == 1) 
		{
			return "1";
		}
		
		sal = n + " ";
		
		if(n%2 == 0) 
		{
			
			return sal + Secuencia(n/2, sal);
			
		}else {
			
			return sal + Secuencia(n*3+1,sal);
			
		}
		
		
	}

}