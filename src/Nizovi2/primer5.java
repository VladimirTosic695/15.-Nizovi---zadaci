package Nizovi2;

import java.io.*;
import java.io.InputStreamReader;

public class primer5 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite dimenziju n niza");
		int n = Integer.parseInt(bf.readLine());
		
		int a [] = new int [n+1];
		
		System.out.println("Unesite elemente niza a");
		for(int i = 1; i<=n; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = Integer.parseInt(bf.readLine());
		}
		
		System.out.println("Elementi niza a pre sortiranja: ");
		for(int i = 1; i<=n; i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i = 1; i<=n; i++) {
			for(int j = i+1; j<=n; j++) {
				int nova;
				if(a[i] < a[j]) {
					nova = a[i];
					a[i] = a[j];
					a[j] = nova;
				}
			}
		}
		System.out.println("\nNiz a posle sortiranja: ");
		for(int i =1; i<=n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
