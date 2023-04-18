package Nizovi2;

import java.io.*;
import java.text.DecimalFormat;

public class primer3 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat ("#,##0.00");
		
		System.out.println("Unesite dimenziju n niza");
		int n = Integer.parseInt(bf.readLine());
		
		double x [] = new double [n+1];
		double y [] = new double [n+1];
		double a [] = new double [n+1];
		
		double sa = 0, sx = 0, sy = 0;
		
		System.out.println("Unesite elemente niza a");
		for(int i = 1; i<=n; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = Double.parseDouble(bf.readLine());
		}
		System.out.println("Unesite elemente niza x");
		for(int i = 1; i<=n; i++) {
			System.out.print("x["+i+"] = ");
			x[i] = Double.parseDouble(bf.readLine());
		}
		System.out.println("Unesite elemente niza y");
		for(int i = 1; i<=n; i++) {
			System.out.print("y["+i+"] = ");
			y[i] = Double.parseDouble(bf.readLine());
		}

		for(int i = 1; i<=n; i++) {
			sa += a[i];
			sx += a[i] * x[i];
			sy += a[i] * y[i];
		}
		System.out.println("\tA\tXt\tYt");
		for(int i = 1; i<=n; i++) {
			//double xt,yt;
			System.out.println("\t"+df.format(sa)+"\t"+df.format(sx/sa)+"\t"+df.format(sy/sa));
		}
	}

}
