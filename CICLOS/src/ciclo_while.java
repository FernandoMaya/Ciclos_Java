import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ciclo_while {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int va = 0;
		int su = 0;
		int c = 0;
		
		while(c<10)
		{
			System.out.println("Ingresa un numero a sumar: ");
			va = Integer.parseInt(lector.readLine());
			su = su + va;
			c = c +1;
		}
		System.out.println("La suma total es: " + su);

	}

}
