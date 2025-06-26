import javax.swing.*;
public class inmobiliaria {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Tamaño "));
		String direccion[] = new String[tam], extension[] = new String[tam];
		int precio[] = new int[tam], opc, n = -1;
		
		do
		{
			opc=Integer.parseInt(JOptionPane.showInputDialog("Control \n 1. Dar de Alta a un Departamento\n 2. Dar de Baja a un Departamento \n 3. Modificar el precio de un departamento por medio de la superficie\n"
						+ " 4. Listar los datos de un departamento determinado\n 5. Imprimir todos los registros\n 6. Salir"));
			
			switch(opc)
			{
				case 1: n=InsertaO(direccion, extension, precio, n,tam);
				break; 
				
				case 2: n=EliminaO(direccion, extension, precio, n);
				break;
				
				case 3: ModificaO(direccion, precio, n);
				break;
				
				case 4: ImprimirUno(direccion, extension, precio, n);
				break; 
				
				case 5: Imprimirtodo(direccion, extension, precio, n);
				break;
				
				case 6: break;
				
				default: JOptionPane.showMessageDialog(null,"Opción Invalida");
			}
		}while(opc!=6);
	}
	
	public static int InsertaO(String direccion[], String extension[], int precio[], int n, int tam)
	{
		if(n==-1)
		{
			n++;
			
			direccion[n]=JOptionPane.showInputDialog("Ingresa la direccion del departamento");
			extension[n]=JOptionPane.showInputDialog("Ingresa la Extensión del departamento (superficie en metros cuadrados de cada departamento)\n");
			precio[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio del departamento " + direccion[n]));

		}
		else if(n<(tam-1))
		{
			String dir= JOptionPane.showInputDialog("De la direccion del departamento a ingresar");
			int pos = Busca(direccion,dir,n);
			if ((pos >= 0)&& ((pos == 0) &&(dir.equalsIgnoreCase(direccion[0]))))
			{
				JOptionPane.showMessageDialog(null, dir + " Es un Departamento Existente");
			}
				else
				{
					n++;
					pos= pos * (-1);
					for(int i=n; i>= (pos+1); i--)
					{
						direccion[i] = direccion[i-1];
						extension[i] = extension[i-1];
						precio[i] = precio[i - 1];
					}
			
					direccion[pos] = dir;
					extension[pos]= JOptionPane.showInputDialog("Ingresa la extension del departamento " + direccion[pos]);
					precio[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio del departamento " + direccion[pos]));

					JOptionPane.showMessageDialog(null, "Insercion realizada");
				}
		}
		else
			JOptionPane.showMessageDialog(null, "No hay espacio en el arreglo");
			
		return n;
	}
	
	public static int EliminaO(String direccion[], String extension[], int precio[], int n)
	{
		if(n>-1)
		{
			String dir= JOptionPane.showInputDialog("Da la direccion del departamento a buscar:");
			int pos = Busca(direccion, dir, n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,dir + "  no existe");
			}
			else
			{
				n=n-1;
				for(int i=pos; i<= n; i++)
				{
					direccion[i] = direccion[i+1];
					extension[i] = extension[i+1];
					precio[i] = precio[i+1];
					
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
	
	public static void ModificaO(String direccion[], int precio[], int n)
	{
		if(n>-1)
		{
			String dir= JOptionPane.showInputDialog("De el nombre del departamento a buscar");
			int pos = Busca(direccion, dir, n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,dir + "  no existe");
			}
			else
			{
				precio[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio actualizado del departamento "+direccion[pos]));
				JOptionPane.showMessageDialog(null, "Modificacion realizada");
			}
		}		
		else
			JOptionPane.showMessageDialog(null, "Array vacio");
	}
	
	public static void ImprimirUno(String direccion[], String extension[],int precio[], int n)
	{
		if(n>-1)
		{
			String uno = "Direccion del departamento \t Extension \t Precio \n";

			String dir= JOptionPane.showInputDialog("De el nombre del departamento a buscar");
			int pos = Busca(direccion, dir, n);
			if ((pos < 0))
			{
				JOptionPane.showMessageDialog(null,dir + "  no existe");
			}
			else
			{
				uno += direccion[pos] + "\t \t" + extension[pos] + "\t" + precio[pos];
				
				JTextArea impr = new JTextArea();
				impr.setText(uno);
				impr.setEditable(false);
				
				JOptionPane.showMessageDialog(null, impr);
			}
			
		
		}		
		else
			JOptionPane.showMessageDialog(null, "Array vacio");
	}
	
	public static void Imprimirtodo(String direccion[], String extension[], int precio[], int n)
	{
		String sal="Direccion del departamento \t Extension \t Precio \n";
		
		for(int i = 0; i <= n; i++)
		{
			sal+= direccion[i] + "\t \t" + extension[i] + "\t" + precio[i] + "\n";
		}
		
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		imp.setEditable(false);
		
		JOptionPane.showMessageDialog(null,imp);
	}
	
	public static int Busca(String direccion[], String dir, int n)
	{
		int i=0;
		while ((i<=n) && (direccion[i].compareTo(dir)< 0))
			i++;
		
		if ((i>n) || (direccion[i].compareTo(dir)> 0))
			return (-i);
		else 
			return (i);
	}
}
