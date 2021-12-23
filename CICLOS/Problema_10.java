import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		int i=0,v=0,v1=0,v2=0,vt=0;
		
		System.out.println("cual es el numero de ventas que a realizado?");
		int nv=Integer.parseInt(teclado.readLine());
		
		for(i=nv;i>0;i=i-1) {
			System.out.println("cual es el valor de la venta");
			v=Integer.parseInt(teclado.readLine());
			System.out.println("el valor de la venta es "+v);
			
			if(v<=10000) {
				v1++;
			}
			if(v>10000&&v<20000) {
				v2++;
			}
			
		}
		System.out.println("el valor total de las ventas es de "+vt+"el numero de ventas menores a 10000 es "+v1+"y mayores"+v2);
		
		
		
		
		
		
		
		
	}

}
