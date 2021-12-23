package practica_7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio_tipo_while_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int c = 0;
		double d = 0;
		double sum = 0;
		int m = 12;

		while (c<m)
		{
			System.out.println("Ingresa el dinero");
			d = Double.parseDouble(lector.readLine());
			System.out.println("llevas " + (d+sum));
			sum = sum+d;
			c = c+1;	
		}
		System.out.println("El ahorro es: " + sum);
		
	}
	    

}
