package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class primer13 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat ("#.###");
		
		System.out.println("Unesite vrednost za a");
		double a = Double.parseDouble(bf.readLine());
		
		System.out.println("Unesite vrednost za n");
		int n = Integer.parseInt(bf.readLine());
		
		double x [] = new double [100];
		
		System.out.println("Unesite elemente niza x");
		for(int i =1; i<=n; i++) {
			System.out.println("x["+i+"] = ");
			x[i] = Double.parseDouble(bf.readLine());
		}
		
		double ver = n * Math.sqrt(a);
		for(int i = n-1; i>=1; i--) {
			ver = i * Math.sqrt(a) + (x[i] - x[i+1]) / ver;
		}
		System.out.println("Vrednost veriznog razlomka F(x) = "+df.format(ver));
	}

}
