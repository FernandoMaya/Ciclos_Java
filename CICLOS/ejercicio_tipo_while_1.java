package practica_7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio_tipo_while_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int e = 0;
		int pr = 0;
		int c = 0;
		int a = 0;
		
		System.out.println("Ingrese numero de alumnos");
		a = Integer.parseInt(lector.readLine());
		
		while(c<a)
		{
			System.out.println("Ingresa la edad");
			e = Integer.parseInt(lector.readLine());
			pr = pr + e;
			c = c + 1; 
			
		}
		
		System.out.println("El promedio es: " + pr/a);


	}

}
