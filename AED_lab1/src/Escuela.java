 import javax.swing.*;
public class Escuela {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño: "));
		String nombre[] = new String[tam], semestres[] = new String[tam], calP[] = new String[tam];
		int opc, n = -1;
		
		do
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Control Estudiantes\n 1.Dar de Alta\n 2.Dar de baja\n 3.Modificar Semestres cursados y promedio total\n"
					+ "4. Listar nombre, numero de semestre cursado y promedio de un alumno determinado\n 5.Listar todos los registros\n 6. Sair "));

			switch(opc)
			{
			case 1: n = InsertaD(nombre, semestres, calP, n, tam);
			break;
			
			case 2: n = EliminaD(nombre, semestres, calP, n);
			break;
			
			case 3: ModificaSP(nombre, semestres, calP, n);
			break;
	
			case 4: ImprimirA(nombre, semestres, calP, n);
			break;
	
			case 5: Imprimir(nombre, semestres, calP, n);
			break;
			
			case 6: break;
	
			default: JOptionPane.showMessageDialog(null,"Opcion Incorrecta\n");
			}
			
		}while(opc != 6);
	}
	
	public static int InsertaD(String nombre[], String semestres[], String calP[], int n, int tam)
	{
		if(n < tam - 1)
		{
			n++;
			nombre[n] = JOptionPane.showInputDialog("Ingresa el nombre:");
			semestres[n] = JOptionPane.showInputDialog("Semestres cursados:");			
			calP[n] = JOptionPane.showInputDialog("Calificacion Promedio Total-semestres:");
		}
		else 
			
			JOptionPane.showMessageDialog(null, "No hay espacio");
			
		return n;	
	}
	
	public static int EliminaD(String nombre[], String semestres[], String calP[], int n)
	{
		String nombreB = JOptionPane.showInputDialog("Ingresa el nombre del Alumno a eliminar:");
			
		int i = 0;
		while((i <= n) && (!(nombreB.equalsIgnoreCase(nombre[i]))))
		{
			i++;
		}
		
		if (i > n)
		{
			JOptionPane.showMessageDialog(null, "No se encontro el nombre");
		}
		else
		{
			for (int k = i; k < n; k++)
			{
				nombre[k] = nombre[k + 1];
				semestres[k] = semestres[k + 1];
				calP[k] = calP[k + 1];
			}
			
			n--;
		}
		
		return n;	
	}
	
	public static void ModificaSP(String nombre[], String semestres[], String calP[], int n)
	{
		String nombreB = JOptionPane.showInputDialog("Ingresa el nombre:");
		
		int i = 0;
		
		while((i <= n) && (!(nombreB.equalsIgnoreCase(nombre[i]))))
		i++;
		
		if (i > n)
		{
			JOptionPane.showMessageDialog(null, nombreB + " No encontrado");
		}
		else 
			semestres[i] = JOptionPane.showInputDialog("Semestres:");
			calP[i] = JOptionPane.showInputDialog("Calificacion promedio Total-semestres:");
	}
	
	public static void ImprimirA(String nombre[], String semestres[], String calP[], int n)
	{
		String impr = "Nombre Alumno \t Semestres \t Promedio Total\n";
		
		String nombreB = JOptionPane.showInputDialog("Ingresa el nombre:");
		
		int i = 0;
		
		while((i <= n) && (!(nombreB.equalsIgnoreCase(nombre[i]))))
		i++;
		
		if (i > n)
		{
			JOptionPane.showMessageDialog(null, nombreB + " No encontrado");
		}
		else
		{
			impr += nombre[i] + "\t\t " + semestres[i] + "\t" + calP[i];
			//JOptionPane.showMessageDialog(null, impr);
			
			JTextArea imp = new JTextArea();
			imp.setText(impr);
			imp.setEditable(false);
			
			JOptionPane.showMessageDialog(null, imp);
		}

	}

	public static void Imprimir(String nombre[], String semestres[], String calP[], int n)
	{
		String sal = "Nombre Alumno \t Semestres \t Promedio Total\n";

		for (int i = 0; i <= n; i++)
		{
			sal += nombre[i] + "\t" + semestres[i] + "\t" + calP[i] + "\n";
		}
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		imp.setEditable(false);
		
		JOptionPane.showMessageDialog(null, imp);
	}
}
