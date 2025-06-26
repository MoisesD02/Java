import javax.swing.*;
public class EmpleadosO {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño: "));
		String nombre[] = new String[tam], direccion[] = new String[tam], sexo[] = new String[tam];
		int antiguedad[] = new int[tam], edad[] = new int[tam], opc ,n = -1;
		
		do
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Control Empleados\n 1. Listar los datos de todos los empleados\n 2. Dar de alta\n 3. Dar de baja\n "
					+ "4. Modificar los años de antiguedad de un emplead\n 5. Listar los datos de un empleado determinado\n 6. Salir"));
			
			switch(opc)
			{
			case 1: Imprimirtodo(nombre,direccion, sexo, antiguedad, edad, n);
			break; 
			
			case 2: n=InsertaO(nombre, direccion, sexo, antiguedad, edad, n, tam);
			break;
			
			case 3: n=EliminaO(nombre, direccion, sexo, antiguedad, edad , n);
			break;
			
			case 4: ModificaO(nombre, antiguedad, n);
			break; 
			
			case 5: ImprimirUno(nombre, direccion, sexo, antiguedad, edad , n);
			break;
			
			case 6: break;
			
			default: JOptionPane.showMessageDialog(null,"Opción Invalida");			}
		}while(opc != 6);
	}
	
	public static void Imprimirtodo(String nombre[], String direccion[], String sexo[], int antiguedad[], int edad[], int n)
	{
		String sal="Nombre de Empleado \t Direccion \t Sexo \t Antiguedad \t edad \n";
		
		for(int i = 0; i <= n; i++)
		{
			sal+= nombre[i] + "\t \t" + direccion[i] + "\t" + sexo[i] + "\t" + antiguedad[i] + "\t" + edad[i] + "\n";
		}
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		imp.setEditable(false);
		
		JOptionPane.showMessageDialog(null,imp);
	}
	
	public static int InsertaO(String nombre[], String direccion[], String sexo[], int antiguedad[], int edad[], int n, int tam)
	{
		if(n==-1)
		{
			n++;
			
			nombre[n]=JOptionPane.showInputDialog("Ingresa el nombre del empleado");
			direccion[n]=JOptionPane.showInputDialog("Ingresa la direccion del empleado");
			sexo[n]=JOptionPane.showInputDialog("Ingrese el sexo del empleado");
			antiguedad[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la antiguedad del empleado " + nombre[n]));
			edad[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del empleado " + nombre[n]));

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
						direccion[i] = direccion[i-1];
						sexo[i] = sexo[i-1];
						antiguedad[i] = antiguedad[i-1];
						edad[i] = edad[i-1];

					}
			
					nombre[pos]=nomB;
					direccion[pos]=JOptionPane.showInputDialog("Ingresa la direccion del empleado " + nombre[pos]);
					sexo[pos]=JOptionPane.showInputDialog("Ingresa el sexo del empleado " + nombre[pos]);
					antiguedad[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la antiguedad del empleado " + nombre[pos]));
					edad[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del empleado " + nombre[pos]));

					JOptionPane.showMessageDialog(null, "Insercion realizada");
				}
		}
		else
			JOptionPane.showMessageDialog(null, "No hay espacio en el arreglo");
			
		return n;
	}
	
	public static int EliminaO(String nombre[], String direccion[], String sexo[], int antiguedad[], int edad[], int n)
	{
		if(n>-1)
		{
			String nomB= JOptionPane.showInputDialog("De el nombre del empleado a buscar");
			int pos = Busca(nombre,nomB,n);
			JOptionPane.showMessageDialog(null, "Pos ="+pos);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,nomB + "  no existe");
			}
			else
			{
				n=n-1;
				for(int i=pos; i<= n; i++)
				{
					nombre[i] = nombre[i+1];
					direccion[i] = direccion[i+1];
					sexo[i] = sexo[i+1];
					antiguedad[i] = antiguedad[i+1];
					edad[i] = edad[i+1];
					
				}
				
				JOptionPane.showMessageDialog(null, "Eliminacion realizada");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Array vacio");
		}
		
		return n;
	}
	
	public static void ModificaO(String nombre[], int antiguedad[], int n)
	{
		if(n > -1)
		{
			String nomB = JOptionPane.showInputDialog("De el nombre del empleado a buscar");
			int pos = Busca(nombre,nomB,n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,nomB + "  no existe");
			}
			else
			{
				antiguedad[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la antiguedad actualizada de "+nombre[pos]));
				JOptionPane.showMessageDialog(null, "Modificacion realizada");
			}
		}		
		else
			JOptionPane.showMessageDialog(null, "Array vacio");
	}
	
	public static void ImprimirUno(String nombre[], String direccion[], String sexo[], int antiguedad[], int edad[], int n)
	{
		if(n>-1)
		{
			String uno = "Nombre de Empleado \t Direccion \t Sexo \t Antiguedad \t edad \n";

			String nomB = JOptionPane.showInputDialog("De el nombre del empleado a buscar");
			int pos = Busca(nombre,nomB,n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,nomB + "  no existe");
			}
			else
			{
				uno += nombre[pos] + "\t \t" + direccion[pos] + "\t" + sexo[pos] + "\t" + antiguedad[pos] + "\t" + edad[pos];
				
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
