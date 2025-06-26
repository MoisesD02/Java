/*Escribir un programa que almacene en arreglos ordenados el nombre y el salario de un grupo de empleados, y que realice las siguientes operaciones:
 1. Dar de alta a un empleado
 2. Dar de baja a un empleado
 3. Modificar el salario de un empleado
 4. Imprimir un registro determinado
 5. Imprimir todos los registros
 6. Salir 
*/

import javax.swing.*;

public class ArregloO 
{
	public static void main (String args[])
	{
		 
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
		
		String nombre[]= new String[tam];
		int salario[] = new int[tam],opc,n=-1;
		
		do
		{
			opc=Integer.parseInt(JOptionPane.showInputDialog("Control de Empleados \n 1. Dar de Alta a un empleado \n"+
															" 2. Dar de Baja a un empleado \n 3. Modificar el salario de un empleado"+ 
															"\n 4. Imprimir un registro \n 5. Imprimir todos los registros \n 6. Salir"));
			
			switch(opc)
			{
				case 1: n=InsertaO(nombre,salario,n,tam);
				break; 
				
				case 2: n=EliminaO(nombre,salario,n);
				break;
				
				case 3: ModificaO(nombre,salario,n);
				break;
				
				case 4: ImprimirUno(nombre,salario,n);
				break; 
				
				case 5: Imprimirtodo(nombre,salario,n);
				break;
				
				case 6: break;
				
				default: JOptionPane.showMessageDialog(null,"Opción Invalida");
			}
		}while(opc!=6);
		
		System.exit(0);
		
	}//Fin del Main
	
	public static int InsertaO(String nombre[], int salario[], int n, int tam)
	{
		if(n==-1)
		{
			n++;
			
			nombre[n]=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
			salario[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado "+nombre[n]));
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
						nombre[i]=nombre[i-1];
						salario[i]=salario[i-1];
					}
			
					nombre[pos]=nomB;
					salario[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado "+nombre[pos]));
					JOptionPane.showMessageDialog(null, "Insercion realizada");
				}
		}
		else
			JOptionPane.showMessageDialog(null, "No hay espacio en el arreglo");
			
		return n;
	}
	
	public static int EliminaO(String nombre[], int salario[], int n)
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
					nombre[i]=nombre[i+1];
					salario[i]=salario[i+1];
				}
				JOptionPane.showMessageDialog(null, "Eliminacion realizada");
			}
		}
		else
			JOptionPane.showMessageDialog(null, "Array vacio");
		
		return n;
	}
	
	public static void ModificaO(String nombre[], int salario[], int n)
	{
		if(n>-1)
		{
			String nomB= JOptionPane.showInputDialog("De el nombre del empleado a buscar");
			int pos = Busca(nombre,nomB,n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,nomB + "  no existe");
			}
			else
			{
				salario[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo salario para el empleado "+nombre[pos]));
				JOptionPane.showMessageDialog(null, "Modificacion realizada");
			}
		}		
		else
			JOptionPane.showMessageDialog(null, "Array vacio");
	}
	
	public static void ImprimirUno(String nombre[], int salario[], int n)
	{
		if(n>-1)
		{
			String nomB= JOptionPane.showInputDialog("De el nombre del empleado a buscar");
			int pos = Busca(nombre,nomB,n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,nomB + "  no existe");
			}
			else
				JOptionPane.showMessageDialog(null,  "Nombre del empleado:  " + nombre[pos] + "\n Salario:  " + salario[pos]+"\n");
		}		
		else
			JOptionPane.showMessageDialog(null, "Array vacio");
	}
	
	public static void Imprimirtodo(String nombre[], int salario[], int n)
	{
		String sal="Nombre de Empleado \t Salario \n";
		
		for(int i=0; i<=n;i++)
			sal+=nombre[i]+"\t \t"+salario[i]+"\n";
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		imp.setEditable(false);
		JOptionPane.showMessageDialog(null,imp);
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

}//Fin de la clase