

import javax.swing.*;

public class producto {

	public static void main(String[] args) {
		
		int n = 10;
		
		int numeros[] = new int[n],num = 0; 
		
		for(int i = 0; i < n; i++) 
		{
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + i + " ha multiplicar"));
		}
		
		num = multiplicar(numeros,n);
		
		JOptionPane.showMessageDialog(null, num);
		
		System.exit(0);
		
	}

	public static int multiplicar(int[] numeros, int n) 
	{
		
		
		if(n == 0){
			
		return 1;
		
		}else {
		
		return numeros[n - 1] * multiplicar(numeros, n - 1);
		
		}
		
	}

}