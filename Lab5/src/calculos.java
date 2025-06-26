import javax.swing.*;
public class calculos {
	public static void main(String args[])
	{
		rectangulo t = new rectangulo();
		int base,altura,n;
		String sal = "Base\tAltura\tPerimetro\tArea\n";
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de rectangulos: "));
		
		for(int i = 0; i < n; i ++)
		{
			base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base: " ));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura: "));
		
			t.Setbas1(base);
			t.Setaltura(altura);
			
			sal += base + "\t" + altura + "\t" + t.CalP() + "\t" + t.CalArea() + "U²\n"; 
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);

		System.exit(0);
		
	}

}
