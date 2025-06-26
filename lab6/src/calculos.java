import javax.swing.*;
public class calculos {
	public static void main(String args[])
	{
		Fecha FN = new Fecha();
		Fecha FA = new Fecha();
		CalEdad em = new CalEdad();
		int n, da,ma,aa,dn,mn,an;
		String M, sal = "Nombre Completo\tF.NAC\t\tEdad\n";
		
		da = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia actual: "));
		ma = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes actual: "));
		aa = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año actual: "));
		FA.SetAsignar(da, ma, aa);
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas: "));
			for(int i = 0; i < n; i ++)
			{
				M = JOptionPane.showInputDialog("Ingresa el nombre de la persona: " + (i + 1));
				dn = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia de nacimiento de: " + M));
				mn = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes de nacimiento de: " + M));
				an = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de nacimiento de: " + M));
								
					FN.SetAsignar(dn,mn,an);
					em.SetAsignar(M, FN, FA);
					
					sal += em;
			}
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
	}
}
