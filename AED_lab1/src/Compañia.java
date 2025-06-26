import javax.swing.*;
public class Compañia {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño: "));
		String nombre[] = new String[tam];
		int Vtotales[] = new int[tam], opc ,n = -1;
		
		do
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Control Vendedores\n 1. Dar de alta\n 2. Modificar total de ventas de un vendedor determinado\n"
					+ "3. Listar los datos de un vendedor determinado\n 4. Salir"));
			
			switch(opc)
			{
			
			case 1: n=InsertaO(nombre, Vtotales, n, tam);
			break;
			
			case 2: ModificaO(nombre, Vtotales, n);
			break; 
			
			case 3: ImprimirUno(nombre, Vtotales, n);
			break;
			
			case 4: break;
			
			default: JOptionPane.showMessageDialog(null,"Opción Invalida");			}
		}while(opc != 4);
	}
	
	public static int InsertaO(String nombre[], int Vtotales[], int n, int tam)
	{
		if(n==-1)
		{
			n++;
			
			nombre[n]=JOptionPane.showInputDialog("Ingresa el nombre del Vendedor");
			Vtotales[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa las ventas totales de " + nombre[n]));

		}
		else if(n<(tam-1))
		{
			String nomB= JOptionPane.showInputDialog("De el nombre del empleado a ingresar");
			int pos = Busca(nombre,nomB,n);
			if ((pos >= 0)&& ((pos == 0) &&(nomB.equalsIgnoreCase(nombre[0]))))
			{
				JOptionPane.showMessageDialog(null,nomB + " el empleado ya existe");
			}
				else
				{
					n=n+1;
					pos= pos * (-1);
					for(int i=n; i>= (pos+1); i--)
					{
						nombre[i] = nombre[i-1];
						Vtotales[i] = Vtotales[i-1];

					}
			
					nombre[pos]=nomB;
					Vtotales[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa las ventas totales de " + nombre[pos]));

					JOptionPane.showMessageDialog(null, "Insercion realizada");
				}
		}
		else
			JOptionPane.showMessageDialog(null, "No hay espacio en el arreglo");
			
		return n;
	}
	
	public static void ModificaO(String nombre[], int Vtotales[], int n)
	{
		if(n>-1)
		{
			String nomB= JOptionPane.showInputDialog("De el nombre del vendedor a buscar");
			int pos = Busca(nombre,nomB,n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,nomB + "  no existe");
			}
			else
			{
				Vtotales[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa las Ventas actualizadas de "+nombre[pos]));
				JOptionPane.showMessageDialog(null, "Modificacion realizada");
			}
		}		
		else
			JOptionPane.showMessageDialog(null, "Array vacio");
	}
	
	public static void ImprimirUno(String nombre[], int Vtotales[], int n)
	{
		if(n>-1)
		{
			String uno = "Nombre del vendedor \t Ventas totales\n";

			String nomB= JOptionPane.showInputDialog("De el nombre del vendedor a buscar");
			int pos = Busca(nombre,nomB,n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,nomB + "  no existe");
			}
			else
			{
				uno += nombre[pos] + "\t \t" + Vtotales[pos];
				
				JTextArea impr = new JTextArea();
				impr.setText(uno);
				impr.setEditable(false);
				
				JOptionPane.showMessageDialog(null, impr);
			}
		}		
		else
			JOptionPane.showMessageDialog(null, "Array vacio");
	}
	
	public static int Busca(String nombre[], String nomB, int n)
	{
		int i=0;
		while ((i<=n) && (nombre[i].compareTo(nomB)< 0))
			i++;
		
		if ((i>n) || (nombre[i].compareTo(nomB)> 0))
			return (-i);
		else 
			return (i);
	}
}
