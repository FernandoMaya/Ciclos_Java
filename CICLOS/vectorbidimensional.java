package vectores;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class vectorbidimensional {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
		
		int b= 0, contador = 0;
		
		int[][] a = new int[4][4];//|| o , && y zertuche
		
		for (int i=0; i<4; i++){
			for (int h=0; h<4; h++){
				System.out.println("Ingrese un numero del 0 a 9"); //guardar y confirmar el numero
				b = Integer.parseInt(lector.readLine());
				
				if (0<=b&&b<=9){
				a[i][h] = b;
				if (b==0){
					contador = contador +1;
				}
				}
				else{
					System.out.println("Numero no valido");
				}		
			}
		}
		System.out.println("El numero total de ceros es de " +contador);
		for (int i=0; i<4; i++){
			for (int h=0; h<4; h++){
				System.out.print(" " +a[i][h]+ " ");
			}
			System.out.println("");
		}
	}
	}	




