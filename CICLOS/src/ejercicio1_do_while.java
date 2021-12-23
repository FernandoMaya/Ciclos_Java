import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio1_do_while {

	public static void main(String[] args) throws IOException{
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int e = 0;
		int su = 0;
		int c = 0;
		int na = 0;
		
		System.out.println("Ingresa el numero de alumnos");
		na = Integer.parseInt(lector.readLine());
		do
		{
			System.out.println("Ingresa la edad ");
			e = Integer.parseInt(lector.readLine());
			su = su + e;
			c = c +1;
		}while(c<na);
		
		System.out.println("La edad promedio es de " + su/na);
	}

}
