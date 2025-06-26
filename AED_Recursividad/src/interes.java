

import javax.swing.*;

public class interes {

	public static void main(String[] args) {
		
		String sal = "Año	Cta.Pedro	Cta.Juan\n";
		
		int año = 2021;
		float ahorro1 = 400, ahorro2 = 500;
		float interes1 = (float) 0.04f, interes2 = (float) 0.023f;
		
		
		sal = calcular(año,ahorro1,ahorro2,interes1,interes2,sal);
		
		
		JTextArea imp = new JTextArea(); imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
		
	}

	private static String calcular(int año, float ahorro1, float ahorro2, float interes1, float interes2,String sal) {
		
		sal += String.format("%d\t%.2f\t%.2f\n", año, ahorro1, ahorro2);
		
		ahorro1 = intereses(interes1,ahorro1);
		ahorro2 = intereses(interes2,ahorro2);
		
		if(ahorro1 <= ahorro2)
		{
			
			return calcular(año+1,ahorro1,ahorro2,interes1,interes2,sal);
			
		}
		
		return sal;
	}

	private static float intereses(float interes, float ahorro) {
		
		return ahorro + (ahorro * interes);
		
	}

}