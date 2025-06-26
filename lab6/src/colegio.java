import javax.swing.*;
public class colegio {
	public static void main(String args[])
	{
		alumnos cal = new alumnos();
		composicion c = new composicion();
		int n, n1,n2,n3;
		String nombre, sal ="Nombre.C\tN1\tN2\tN3\tPromedio\n";
		
		n  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de alumnos: "));
		
		for(int i = 0; i < n; i ++)
		{
			nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno: " + (i + 1));
			n1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la primera nota del alumno: " + nombre));
			n2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la segunda nota del alumno: " + nombre));
			n3= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la tercera nota del alumno: " + nombre));
			
			cal.SetAsignar(n1,n2,n3);
			c.SetAsignar(nombre, cal);
			
			sal += c;
		}
		
		JTextArea imp = new JTextArea();
		imp.setEditable(false);
		imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);	
	}
}
