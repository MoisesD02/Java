import javax.swing.*;
public class ejercicio2 {
	public static void main(String args[])
	{
		Telefono tl = new Telefono();
		solicitud dom = new solicitud();
		String M, domi, tele, celu;
		String sal = "Nombre completo\tTelefonos\n\t\tDomicilio/trabajo/celular";
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas: "));
		
		for(int i = 0; i < n; i ++)
		{
			M = JOptionPane.showInputDialog("Ingresa el nombre de la persona: " + (i + 1));
			domi = JOptionPane.showInputDialog("Ingresa el domicilio de la persona: " + (i + 1));
			tele = JOptionPane.showInputDialog("Ingresa el trabajo de la persona: " + (i + 1));
			celu = JOptionPane.showInputDialog("Ingresa el celular de la persona: " + (i + 1));
			
			tl.SetAsignar(domi,tele,celu);
			dom.SetAsignar(M, tl);
			
			sal += dom;
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
	}

}
