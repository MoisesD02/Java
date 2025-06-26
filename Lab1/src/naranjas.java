import javax.swing.JOptionPane;
public class naranjas {
	public static void main(String args[]){
		
		int docenas, montoC;
		float descuento1, descuento2, totalPago1, totalPago2;
		
		docenas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las docenas de naranjas a comprar"));
		
		montoC = docenas * 24;
		descuento1 = montoC * 15 / 100;
		descuento2 = montoC * 10 / 100;
		totalPago1 = montoC - descuento1;
		totalPago2 = montoC - descuento2;
		
		if(docenas > 3) {
			JOptionPane.showMessageDialog(null, "Cantidad de docenas a pagar: " + docenas + "\nMonto de la compra: " + montoC + "\nDescuento: " + descuento1 + "\nMonto a pagar: " + totalPago1);
			
		}else {
			JOptionPane.showMessageDialog(null, "Cantidad de docenas a pagar: " + docenas + "\nMonto de la compra: " + montoC + "\nDescuento: " + descuento2 + "\nMonto a pagar: " + totalPago2);

		}	
	}

}