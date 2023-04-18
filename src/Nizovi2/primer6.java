package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primer6 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite dimenziju n niza");
		int n = Integer.parseInt(bf.readLine());
		
		int a [] = new int [n+1];
		int b [] = new int [n+1];
		int c [] = new int [n+1];
		
		System.out.println("Unesite stranice trougla a,b i c");
		for(int i = 1; i<=n; i++) {
			System.out.println("Moguce stranice "+i+". trougla: ");
			System.out.print("a["+i+"] = ");
			a[i] = Integer.parseInt(bf.readLine());
			System.out.print("b["+i+"] = ");
			b[i] = Integer.parseInt(bf.readLine());
			System.out.print("c["+i+"] = ");
			c[i] = Integer.parseInt(bf.readLine());
		}
		System.out.println("\ta\tb\tc\tcine trougao");
		for(int i = 1; i<=n; i++) {
			if(a[i] + b[i] > c[i] && Math.abs(a[i] - b[i]) < c[i]) {
				System.out.println("\t"+a[i]+"\t"+b[i]+"\t"+c[i]+"\tda ");
			} else {
				System.out.println("\t"+a[i]+"\t"+b[i]+"\t"+c[i]+"\tne ");
			}
		}
	/*	
		System.out.println("Unesite elemente niza b");
		for(int i = 1; i<=n; i++) {
			System.out.print("b["+i+"] = ");
			b[i] = Integer.parseInt(bf.readLine());
		}
		System.out.println("Unesite elemente niza c");
		for(int i = 1; i<=n; i++) {
			System.out.print("c["+i+"] = ");
			c[i] = Integer.parseInt(bf.readLine());
		}*/
		
		
	}

}
