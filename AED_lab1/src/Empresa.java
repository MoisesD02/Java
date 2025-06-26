import javax.swing.*;
public class Empresa {
	public static void main(String args[])
	{
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño: "));
		String nombre[] = new String[tam], telefono[] = new String[tam], saldo[] = new String[tam];
		String moroso[] = new String[tam];
		int opc, n = -1;
		
		do
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Control Empresa \n 1. Dar de alta a un cliente\n 2. Modificar estado moroso de un cliente\n 3. Dar de baja a un cliente\n"
					+ " 4. Listar la informacion completa de un cliente determinado\n 5. Listar la informacion de todos los clientes\n 6. Salir"));
			
			switch(opc)
			{
			case 1: n = InsertaD(nombre, telefono, saldo, moroso, n, tam);
			break;
			
			case 2: ModificaM(nombre, telefono, saldo, moroso, n);
			break;
			
			case 3: n = EliminaD(nombre, telefono, saldo, moroso, n);
			break;
	
			case 4: ImprimirC(nombre, telefono, saldo, moroso, n);
			break;
	
			case 5: Imprimir(nombre, telefono, saldo, moroso, n);
			break;
			
			case 6: break;
	
			default: JOptionPane.showMessageDialog(null,"Opcion Incorrecta\n");
			}
			
		}while(opc != 6);
			
	}
	public static int InsertaD(String nombre[], String telefono[], String saldo[], String moroso[], int n, int tam)
	{
		if(n < tam - 1)
		{
			n++;
			nombre[n] = JOptionPane.showInputDialog("Ingresa el nombre:");
			telefono[n] = JOptionPane.showInputDialog("Telefono:");			
			saldo[n] = JOptionPane.showInputDialog("Saldo:");
			moroso[n] = JOptionPane.showInputDialog("Moroso(SI - NO):");
		
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "No hay espacio");
		}
		
		return n;
	}

	public static void ModificaM(String nombre[], String telefono[], String saldo[], String moroso[], int n)
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
			moroso[i] = JOptionPane.showInputDialog("Moroso (SI - NO):");
		}
	}

	public static int EliminaD(String nombre[], String telefono[], String saldo[], String moroso[], int n)
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
				telefono[k] = telefono[k + 1];
				saldo[k] = saldo[k + 1];
				moroso[k] = moroso[k + 1];
			}
		
			n--;
		}	
	
		return n;	
	}

	public static void ImprimirC(String nombre[], String telefono[], String saldo[], String moroso[], int n)
	{
		String impr = "Nombre Cliente \t Telefono \t Saldo \t Estado moroso \n";
	
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
			impr += nombre[i] + "\t\t " + telefono[i] + "\t" + saldo[i] + "\t" + moroso[i];
		
			JTextArea imp = new JTextArea();
			imp.setText(impr);
			imp.setEditable(false);
		
			JOptionPane.showMessageDialog(null, imp);
		}

	}

	public static void Imprimir(String nombre[], String telefono[], String saldo[], String moroso[], int n)
	{
		String sal = "Nombre Cliente \t Telefono \t Saldo \t Estado moroso \n";

		for (int i = 0; i <= n; i++)
		{
			sal += nombre[i] + "\t\t" + telefono[i] + "\t" + saldo[i] + "\t" + moroso[i] + "\n";
		}
	
		JTextArea imp = new JTextArea();
		imp.setText(sal);
		imp.setEditable(false);
	
		JOptionPane.showMessageDialog(null, imp);
	}
}