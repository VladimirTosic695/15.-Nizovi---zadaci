package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class primer14 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat ("#.###");
		
		System.out.println("Unesite vrednost za x");
		double x = Double.parseDouble(bf.readLine());
		
		System.out.println("Unesite vrednost za n");
		int n = Integer.parseInt(bf.readLine());
		
		double a [] = new double [100];
		
		System.out.println("Unesite elemente niza a");
		for(int i = 1; i<=n; i++) {
			System.out.println("a["+i+"] = ");
			a[i] = Double.parseDouble(bf.readLine());
		}
		double ver = x;
		for(int i = n; i>=2; i--) {
			ver = x + a[i]/ver;
		}
		ver = a[1] / ver;
		System.out.println("V = "+df.format(ver));
		
	}

}
