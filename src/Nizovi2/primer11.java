package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primer11 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite dimenziju niza n");
		int n = Integer.parseInt(bf.readLine());

		double a[] = new double[100];
		double b[] = new double[100];
		double c[] = new double[100];
		double x[] = new double[100];
		double s = 0;
		
		System.out.println("Unesite elemente nizova");
		for(int i = 1; i<=n; i++) {
			System.out.println(i+". unos podataka");
			System.out.println("a["+i+"] = ");
			a[i] = Double.parseDouble(bf.readLine());
			System.out.println("b["+i+"] = ");
			b[i] = Double.parseDouble(bf.readLine());
			System.out.println("c["+i+"] = ");
			c[i] = Double.parseDouble(bf.readLine());
		}
		
		for(int i = 1; i<=n; i++) {
			if(a[i] + b[i] > c[i]) {
				x[i] = Math.pow(a[i], 2) + Math.pow(b[i], 2) + Math.pow(c[i], 2);
			} else if(a[i] + b[i] == c[i] ) {
				x[i] = a[i] + 2*b[i]*c[i];
			} else {
				x[i] = a[i] + b[i] - c[i];
			}
			s += x[i];
		}
		System.out.println("Zbir "+ n + " sabiraka je: ");
		System.out.println("S = "+s);
	}

}
