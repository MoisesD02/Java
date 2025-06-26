import javax.swing.*;
public class Empleados_emp {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño: "));
		String nombre[] = new String[tam], sexo[] = new String[tam], edad[] = new String[tam];
		int opc, n = -1;
		
		do
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Control Empleados\n 1. Dar de alta a un empleado \n 2. Dar de baja a un empleado\n"
					+ " 3. Actualizar la edad de un empleado\n 4. Imprimir todos los registros de los empleados varones\n 5. Imprimir un registro determinado\n 6. Salir"));
			
			switch(opc)
			{
			case 1: n = InsertaD(nombre, sexo, edad, n, tam);
			break;
			
			case 2: n = EliminaD(nombre, sexo, edad, n);
			break;
			
			case 3: ModificaE(nombre, edad, n);
			break;
	
			case 4: ImprimirV(nombre, sexo, edad, n);
			break;
	
			case 5: Imprimir(nombre, sexo, edad, n);
			break;
			
			case 6: break;
	
			default: JOptionPane.showMessageDialog(null,"Opcion Incorrecta\n");
			}
			
		}while(opc != 6);
		
	}
	
	public static int InsertaD(String nombre[], String sexo[], String edad[], int n, int tam)
	{
		if(n < tam - 1)
		{
			n++;
			nombre[n] = JOptionPane.showInputDialog("Ingresa el nombre:");
			sexo[n] = JOptionPane.showInputDialog("Sexo (M - F):").toUpperCase();			
			edad[n] = JOptionPane.showInputDialog("Edad:");			
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "No hay espacio");
		}
		return n;
	}
	
	public static int EliminaD(String nombre[], String sexo[], String edad[], int n)
	{
		String nombreB = JOptionPane.showInputDialog("Ingresa el nombre del Cliente a eliminar:");
			
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
				sexo[k] = sexo[k + 1];
				edad[k] = edad[k + 1];
			}
			
			n--;
		}
		
		return n;	
	}
	
	public static void ModificaE(String nombre[], String edad[], int n)
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
		{
			edad[i] = JOptionPane.showInputDialog("Edad Actualizada: ");
		}
	}
	
	public static void ImprimirV(String nombre[], String sexo[], String edad[], int n)
	{
		
		String varones = "Nombre del Empleado \t Sexo \t Edad\n";
		int i = 0;
			
			for(i = 0; i <= n; i++)
			{
				if((sexo[i].equals("M")))
				{
					varones += nombre[i] + "\t \t" + sexo[i] + "\t" + edad[i] + "\n";
				}
			}

		JTextArea impr = new JTextArea();
		impr.setText(varones);
		impr.setEditable(false);
		
		JOptionPane.showMessageDialog(null, impr);
	}
	
	public static void Imprimir(String nombre[], String sexo[], String edad[], int n)
	{
		String impr = "Nombre Empleado \t Sexo \t Edad\n";
		
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
			impr += nombre[i] + "\t\t " + sexo[i] + "\t" + edad[i];
			
			JTextArea imp = new JTextArea();
			imp.setText(impr);
			imp.setEditable(false);
			
			JOptionPane.showMessageDialog(null, imp);
		}
	}
}
