import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class ejProfe extends JFrame
{   // declaración de variables de instancia
      private static final long serialVersionUID = 1L;
      private int n=-1;
      private String nombre[]= new String[5];
      private float salario[] = new float[5];
      private JTextArea areaTexto = new JTextArea(20,30);
      Container contenedor = getContentPane();
     
      public ejProfe()
      {
             super("Empleado");
             contenedor.setLayout(new FlowLayout());
             
             //Bloque que mide el tamañp de la pantalla y divide en dos para centrar el JFrame 
             Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
             int height = pantalla.height;
             int width = pantalla.width;
             setSize(width/2, height/2);		

             setLocationRelativeTo(null);		
             setVisible(true);

             //Se crean los menus utilizando acronimos de setMnemonic
             JMenu menuAct = new JMenu("Actualizar");
             menuAct.setMnemonic('A');

            JMenuItem mIns = new JMenuItem("Insertar");
            mIns.setMnemonic('I');
            menuAct.add(mIns);
            mIns.addActionListener(
            new ActionListener(){
               public void actionPerformed(ActionEvent evento)
              {
      	InsertarOrd();
              }
          }
           );    //fin de ActionListener Insertar
            JMenuItem mElim = new JMenuItem("Eliminar");
            mElim.setMnemonic('E');
            menuAct.add(mElim);
            mElim.addActionListener(
            new ActionListener(){
                  public void actionPerformed(ActionEvent evento)
                 {
            	EliminarOrd();
                  }
            }
            );   //fin de ActioneListener Eliminar

            JMenuItem mMod = new JMenuItem("Modificar");
            mMod.setMnemonic('M');
            menuAct.add(mMod);
            mMod.addActionListener(
            new ActionListener(){
                  public void actionPerformed(ActionEvent evento)
                 {
            	ModificarOrd();
                 }
            }
            );   //fin de ActioneListener Modificar
            JMenuItem mImpE = new JMenuItem("ImprimirE");
            mImpE.setMnemonic('p');
            menuAct.add(mImpE);
            mImpE.addActionListener(
            new ActionListener(){
                  public void actionPerformed(ActionEvent evento)
                 {
            	ImprimirE();
                  }
            }
            );    //fin de ActionListener imprimirE

            JMenuItem mImpTR = new JMenuItem("ImprimirR");
            mImpTR.setMnemonic('T');
            menuAct.add(mImpTR);
            mImpTR.addActionListener(
            new ActionListener(){
                  public void actionPerformed(ActionEvent evento)
                 {
            	ImprimirR();
                 }
            }
            );     //fin de ActionListener ImprimirR
            JMenuItem Salir = new JMenuItem("Salir");
            Salir.setMnemonic('S');
            menuAct.add(Salir);
            Salir.addActionListener(
            new ActionListener(){
                 public void actionPerformed(ActionEvent evento)
                {
            	System.exit(0);
                }
            }
            );   //fin de ActionListener Salir

            //crear barra de menu y adjuntarla 

            JMenuBar barra = new JMenuBar();
            setJMenuBar(barra);
            barra.add(menuAct);

            setSize(550,400);
            setVisible(true);
            }  //fin constructor
      public int Busca(String nombre[], String nomb, int n)
      {
             int i=0;
             while ((i<=n) && (nombre[i].compareTo(nomb)< 0))
      		i++;
             if ((i>n) || (nombre[i].compareTo(nomb)> 0))
      	return (-i);
             else 
      	return (i);
      }

      public void InsertarOrd()
      {
          if (n<4)
         {
             String nomb= JOptionPane.showInputDialog("De el nombre del empleado");
             if (n==-1)
            {
                n=n+1;
                nombre[n]= nomb;
               salario[n]=Float.parseFloat(JOptionPane.showInputDialog("De el salario del empleado"));
               JOptionPane.showMessageDialog(null, "elemento "+nomb+" fue insertado");
            }

             else
             {
                   int pos = Busca(nombre,nomb,n);
                  if ((pos >= 0) && (nombre[0].compareTo(nomb)==0))
          	JOptionPane.showMessageDialog(null, "El empleado " + nomb +" ya existe");
                  else
                 {
          	n=n+1;
          	pos= pos * (-1);
          	for(int i=n; i>= (pos+1); i--)
          	{
          		nombre[i]=nombre[i-1];
          		salario[i]=salario[i-1];
          	}
          	nombre[pos]= nomb;
          	salario[pos]= Float.parseFloat(JOptionPane.showInputDialog("De el salario del empleado"));
          	JOptionPane.showMessageDialog(null, "El empleado "+ nomb +" fue insertado");
                  }
              }
          }
          else
          JOptionPane.showMessageDialog(null, "No hay espacio disponible");
          }

      public void EliminarOrd()
      {
               if(n>-1)
              {
      	String nomb= JOptionPane.showInputDialog("De el nombre del empleado a buscar");
      	int pos = Busca(nombre,nomb,n);
      	if (pos < 0)
      	        JOptionPane.showMessageDialog(null, "El empleado " + nomb +" no existe");
      	else
      	{
      	        n=n-1;
      	        for(int i=pos; i<= n; i++)
      	       {
      		nombre[i]=nombre[i+1];
      		salario[i]=salario[i+1];
      	       }
      	       JOptionPane.showMessageDialog(null, "El empleado "+ nomb +" fue eliminado");
      	}
      	ImprimirR();
               }
               else
      	JOptionPane.showMessageDialog(null, "Array vacio");
      }
      public void ModificarOrd()
      {
               if(n>-1)
              {
      	String nomb= JOptionPane.showInputDialog("De el nombre del empleado a buscar");
      	int pos = Busca(nombre,nomb,n);
      	if (pos < 0)
      		JOptionPane.showMessageDialog(null,  "El empleado "+ nomb +" no existe");
      	else
      	{
      		salario[pos]= Float.parseFloat(JOptionPane.showInputDialog("De el salario de reemplazo"));;
      		JOptionPane.showMessageDialog(null, "El salario fue modificado");
      	}
      	ImprimirR();
             }
             else
      	JOptionPane.showMessageDialog(null, "Array vacio");
      }
      public void ImprimirR()
      {
              String sal="Nombre \t \t Salario\n";
              if (n > -1)
             {
      	for(int i=0; i<= n; i++)
      	        sal+= nombre[i] + "\t \t " + salario[i] + "\n";
      	areaTexto.setText(sal);
      	areaTexto.repaint();
      	contenedor.add(areaTexto);
      	setVisible(true);
              }
              else
      	JOptionPane.showMessageDialog(null, "array vacio");

      }
      public void ImprimirE()
      {

             String sal="Nombre\tSalario\n";
             if (n > -1)
            {
                  String nomb= JOptionPane.showInputDialog("De el nombre del empleado a buscar");

                  int pos = Busca(nombre,nomb,n);
                 if (pos < 0)
                       JOptionPane.showMessageDialog(null,  "El empleado "+ nomb +" no existe");
                else
               {
      	sal= sal+= nombre[pos] + "\t" + salario[pos];
      	areaTexto.setText(sal);
      	areaTexto.repaint();
      	contenedor.add(areaTexto);
      	setVisible(true);
                }
             }
             else
      	JOptionPane.showMessageDialog(null, "array vacio");
      }
      public static void main(String args[])
  	{
  		ejProfe array = new ejProfe();
  		array.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	}
  }