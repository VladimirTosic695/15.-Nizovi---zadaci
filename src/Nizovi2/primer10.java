package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primer10 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite dimenziju niza n");
		int n = Integer.parseInt(bf.readLine());
		
		double F [] = new double [100];
		
		F[0] = 0;
		F[1] = 1;
		
		for(int i = 2; i<=n; i++) {
			F[i] = 3 * F[i-1] - 2*F[i-2] + F[i-1]*F[i-2];
		}
		System.out.println("F("+n+") = "+F[n]);
		
	}

}
