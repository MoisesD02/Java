import javax.swing.JOptionPane;
public class formula {
	public static void main(String args[]) {
		int t,v,w,x,z,y;
		
		t = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de T"));
		v = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de V"));
		w = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de W"));
		x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de X"));
		z = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de Z"));
		
		//y = (x + z) / (w - (t * v));
		y = (x * (z + w)) / (t - v);
		 //y = x*(z+w)/t-v;
		
		JOptionPane.showMessageDialog(null, "CALCULAR Y \n" + "\nT = " + t + "\nV = " + v + "\nW = " + w + "\nX = " + x + "\nZ = " + z + "\nY = " + y);
		
		System.exit(0);
		
	}
}
