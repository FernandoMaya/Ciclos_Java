package practica_7;
import java.io.BufferedReader;

import java.io.InputStreamReader;
public class for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int pr = 1;
		
		for(int p = 1; p <= 19; p=p+2)
		{
			pr = pr * p;
		}
		
		System.out.println("el producto es :" + pr);
	}

}
