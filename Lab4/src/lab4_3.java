import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class lab4_3 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes a evaluar"));
		
		String nombre[] = new String[n];
		
		int notas[][] = new int[n][3];
		
		float promedio[] = new float[n];
		
		String grado[] = new String[n];
		
		int nota_maxima[] = new int[3];
		
		
		for(int i = 0; i < n; i++) {
			
			nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante "+(i+1));
		
			for(int j = 0; j < 3; j++) {
				
				notas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota "+(j+1)+" del estudiante "+nombre[i]));
				
			}
			
		}
		
		calculos(notas,n,promedio,grado);
		
		Nota_Maxima(n,notas,nota_maxima);
		
		String sal = "Nombre\tNotas\tPromedio\tGrado\n";
		
		for(int i = 0; i < n; i++) {
			
			sal += nombre[i]+"\t";
			
			for(int j = 0; j < n; j++) {
				
				sal += notas[i][j]+"  ";
			}
			sal += "\t"+promedio[i];
			sal += "\t"+grado[i];
			sal += "\n";
		}
		
		sal += "\nNota Maxima: ";
		
		for(int i = 0; i < 3; i++) {
			sal += nota_maxima[i]+"\t";
		}
		
		JTextArea imp = new JTextArea();imp.setText(sal);
		JOptionPane.showMessageDialog(null, imp);
		
		System.exit(0);
		
		
}

	
	private static void Nota_Maxima(int n, int[][] notas,int[] nota_maxima) {
		
		for(int j = 0; j < 3; j++) {
			
			nota_maxima[j] = notas[0][j];
			
			for(int i = 0; i < n; i++) {
				
				if(notas[i][j] > nota_maxima[j]) {
					
					nota_maxima[j] = notas[i][j];
				
				}
				
			}
			
		}
		
	}


	private static void calculos(int[][] notas, int n, float[] promedio, String grado[]) {
		
		int suma;
		
		for(int i = 0; i < n; i++) {
			
			suma = 0;
			
			for(int j = 0; j < 3; j++) {
			
				suma += notas[i][j];
			
			}
			promedio[i] = suma/3;
			
			if(promedio[i] > 70) {
				grado[i] = "Aprobado";
			}else {
				grado[i] = "Reprobado";
			}
			
		}
		
		
		
	}

}