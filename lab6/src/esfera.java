import javax.swing.*;
public class esfera {
	public static void main(String args[])
	{
		poligono p = new poligono();
		int radio, n;
		String sal = "Radio\tArea.E\tVolumen.E\n";
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de esferas"));
		
		for(int i = 0; i < n; i ++)
		{
			radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio de la esfera" + (i + 1)));
			
			p.SetAsignar(radio);
			
			sal += p.GetAsignar() + "\t" + p.CalcularA() + "\t" + p.CalcularV() + "\n";
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
	}
}
