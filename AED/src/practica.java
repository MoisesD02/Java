import javax.swing.*;
public class practica {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el alcance: "));
		String nombre[] = new String[tam], ubicacion[] = new String[tam];
		int cal[] = new int[tam], opc, n = -1;
		
		do
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Control estudiantes\n 1. Dar de alta\n 2. Dar de baja\n 3. Modificar calificacion\n"
					+ " 4. Imprimir un alumno determinado\n 5. Imprimir todos los registros\n 6. Salir"));
			
			switch(opc)
			{
			case 1: n = InsertaD(nombre, ubicacion, cal, n, tam);
			break;
			
			case 2: n = EliminaD(nombre, ubicacion, cal, n);
			break;
			
			case 3: modificaC(nombre, cal, n); 
			break;
			
			case 4: imprimirUno(nombre, ubicacion, cal, n);
			break;
			
			case 5: imprimir(nombre, ubicacion, cal, n);
			break;
			
			case 6: break;
			
			}
		}while(opc != 6);
	}
	
	public static int InsertaD(String nombre[], String ubicacion[], int cal[], int n, int tam)
	{
		if (n < tam -1)
		{
			n++;
			nombre[n] = JOptionPane.showInputDialog("Ingresa el nombre: ");
			ubicacion[n] = JOptionPane.showInputDialog("Ingresa la ubicacion: ");
			cal[n] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion: "));
		}
		else
		{
			JOptionPane.showMessageDialog(null, "No hay espacio en el array");
		}
		return n;
	}
	
	public static int EliminaD(String nombre[], String ubicacion[], int cal[], int n)
	{
		String nomB = JOptionPane.showInputDialog("Ingresa el nombre del alumno a eliminar: ");
		
		int i = 0;
		while((i <= n) && (!nomB.equalsIgnoreCase(nombre[i])))
		{
			i++;
		}
		
		if (i > n)
		{
			JOptionPane.showMessageDialog(null, nomB + "No encontrado");
		}
		else
		{
			for(int k = i; k <= n; k ++)
			{
				nombre[i] = nombre[i + 1];
				ubicacion[i] = ubicacion[i + 1];
				cal[i] = cal[i + 1];
			}
			
			n--;
		}
		
		return n;
	}
	
	public static void modificaC(String nombre[], int cal[], int n)
	{
		String nomB = ("Ingresa el nombre del alumno que quieres modificar: ");
		
		int i = 0;
		
		while((i <= n) && (!nomB.equalsIgnoreCase(nombre[i])))
		{
			i++;
		}
		
		if (i > n)
		{
			JOptionPane.showMessageDialog(null,"No se encontro");
		}
		else
		{
			cal[i] = Integer.parseInt(JOptionPane.showInputDialog("Calificacion Modificada: "));
		}
	}
	
	public static void imprimirUno(String nombre[], String ubicacion[], int cal[], int n)
	{
		String impr = "Nombre alumno\tUbicacion\tCalificacion\n";
		String nomB = JOptionPane.showInputDialog("Ingresa el nombre del alumno a imprimir: ");
		int i = 0;
		while((i <=n ) && (!nomB.equalsIgnoreCase(nombre[i])))
		{
			i++;
		}
		if(i > n)
		{
			JOptionPane.showMessageDialog(null, "No se encontro");
		}
		else
		{
			impr += nombre[i] + "\t \t" + ubicacion[i] + "\t" + cal[i];
			
			JTextArea im = new JTextArea();
			im.setText(impr);
			im.setEditable(false);
			
			JOptionPane.showMessageDialog(null, im);
		}
	}
	
	public static void imprimir(String nombre[], String ubicacion[], int cal[], int n)
	{
		String sal = "Nombre alumnos\tUbicacion\tcalificaciones\n";
		
		for(int i = 0; i <= n; i++)
		{
			sal += nombre[i] + "\t \t" + ubicacion[i] + "\t" + cal[i] + "\n";
		}
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		imp.setEditable(false);
		
		JOptionPane.showMessageDialog(null, imp);
	}
}
