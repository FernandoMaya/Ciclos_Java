import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio2_while {

public static void main(String[] args) throws IOException{
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		double ah = 0;
		double su = 0;
		int c = 0;
		
		
		
		while(c<12)
			{
			System.out.println("Ingresa el ahorro del mes");
			ah = Double.parseDouble(lector.readLine());
			
			
			su = su + ah;
			c = c +1;
			System.out.println("El dinero Ahorrado hasta ahora es de " + su + " Dolares");
			}
		System.out.println("Su ahorro en un año es de " + su + " Dolares");
	}

}
