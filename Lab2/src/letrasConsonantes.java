import javax.swing.JOptionPane;

public class letrasConsonantes {

	public static void main(String args[])
	{
		String text;
		int consonantes = 0, n = 1, espacios = 0;
		
		text = JOptionPane.showInputDialog("Texto: ");
		
		int i = text.length();
		
		while (n < i)
		{
			if (text.charAt(n) == 'a'){
				consonantes = consonantes + 0;
			}else if(text.charAt(n) == 'e'){
				consonantes = consonantes + 0;
			}else if(text.charAt(n) == 'i'){
				consonantes = consonantes + 0;
			}else if(text.charAt(n) == 'o'){
				consonantes = consonantes + 0;
			}else if(text.charAt(n) == 'u'){
				consonantes = consonantes + 0;
			}else if(text.charAt(n) == ' '){
				espacios ++;
			}else
				consonantes ++;
			
			n++;
		}
		
		JOptionPane.showMessageDialog(null, "Consonantes: " +consonantes + "\nEspacios en blanco: " + espacios);
	}
}