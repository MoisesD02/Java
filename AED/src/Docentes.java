import javax.swing.*;
public class Docentes {
	public static void main(String args[]){
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño: "));
		String nom[] = new String[tam], dir[] = new String[tam], ndoc[] = new String[tam];
		int opc, n = -1;
		do
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Control docente\n 1.Dar de Alta\n 2.Dar de baja\n 3.Modificar direccion\n 4.Imprimir registros\n 5.Salir "));
			
			switch(opc)
			{
				case 1: n = InsertaD(nom, dir, ndoc, n, tam);
						break;
				case 2: n = EliminaD(nom, dir, ndoc, n);
						break;
				case 3: ModificaDireccion(nom, dir, n);
						break;
				case 4: Imprimir(nom, dir, ndoc, n);
						break;
				case 5: break;
				
				default: JOptionPane.showMessageDialog(null,"Opcion Incorrecta\n");
			}
			
		}while(opc != 5);
		
		System.exit(0);
	}
	
public static int InsertaD(String nom[], String dir[], String ndoc[], int n, int tam)
{
	if(n < tam - 1)
	{
		n++;
		nom[n] = JOptionPane.showInputDialog("Ingresa el nombre:");
		dir[n] = JOptionPane.showInputDialog("Ingresa la direccion:");			
		ndoc[n] = JOptionPane.showInputDialog("Ingresa el # Documento:");
	}
	else 
		
		JOptionPane.showMessageDialog(null, "NO hay espacio");
		
	return n;
	
}
	
public static int EliminaD(String nom[], String dir[], String ndoc[], int n)
{
	String nombreB = JOptionPane.showInputDialog("Ingresa el nombre del docente a eliminar:");
		
	int i = 0;
	while((i <= n) && (!(nombreB.equalsIgnoreCase(nom[i]))))
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
			nom[k] = nom[k + 1];
			dir[k] = dir[k + 1];
			ndoc[k] = ndoc[k + 1];
		}
		
		n--;
	}
	
	return n;	
}

public static void ModificaDireccion(String nom[], String dir[], int n)
{
	String nombreB = JOptionPane.showInputDialog("Ingresa el nombre:");
	
	int i = 0;
	
	while((i <= n) && (!(nombreB.equalsIgnoreCase(nom[i]))))
	i++;
	
	if (i > n)
	{
		JOptionPane.showMessageDialog(null, nombreB + "No encontrado");
	}
	else 
		dir[i] = JOptionPane.showInputDialog("Nombre:");
}

public static void Imprimir(String nom[], String dir[], String ndoc[], int n)
{
	String sal = "Nombre Docente \t Direccion \t NDocumento\n";

	for (int i = 0; i <= n; i++)
	{
		sal += nom[i] + "\t" + dir[i] + "\t" + ndoc[i] + "\n";
	}
	
	JTextArea imp = new JTextArea();
	imp.setText(sal);
	imp.setEditable(false);
	
	JOptionPane.showMessageDialog(null, imp);
	System.exit(0);
}

}
