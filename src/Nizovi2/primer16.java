package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class primer16 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat ("#.###");
		
		System.out.println("Unesite vrednost za n");
		double n = Double.parseDouble(bf.readLine());
		
		double x [] = new double [100];
		double a [] = new double [100];
		double y [] = new double [100];
		
		System.out.println("Unesite elemente nizova a i x");
		for(int i = 1; i<=n; i++) {
			System.out.println(i+". unos podataka");
			System.out.print("x["+i+"] = ");
			x[i] = Double.parseDouble(bf.readLine());
			System.out.print("a["+i+"] = ");
			a[i] = Double.parseDouble(bf.readLine());
		}
		
		y[1] = 0;
		for(int i = 2; i<=n; i++) {
			if(x[i] > 0) {
				y[i] = a[i] * x[i];
			} else {
				y[i] = y[i-1];
			}
		}
			System.out.println("R.BR.\tA\tX\tY");
			for(int i = 1; i<=n; i++) {
				System.out.println(i+"\t"+a[i]+"\t"+x[i]+"\t"+df.format(y[i]));
			}
	}

}
