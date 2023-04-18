package Nizovi2;

import java.util.Scanner;

public class primer1 {

	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
		
		System.out.println("Unesite dimenziju n niza");
		int n = sc.nextInt();
		
		double x [] = new double [101];
		double y [] = new double [101];
		
		System.out.println("Unesite elemente niza x i y");
		for(int i = 1; i<=n; i++) {
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
			System.out.print("y["+i+"] = ");
			y[i] = sc.nextDouble();
		}
		
		x[0] = x[n];
		x[n+1] = x[n];
		y[0] = y[n];
		y[n+1] = y[n];
		
		
		double s = 0,p = 1;
		for(int i = 1; i<=n; i++) {
			s += y[i] * (x[i-1] - x[i+1]);
		}
		p = 0.5*s;
		System.out.println("Povrsina parcele je "+p);
		sc.close();
	}

}
