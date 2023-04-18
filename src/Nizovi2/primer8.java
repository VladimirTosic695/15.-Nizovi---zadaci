package Nizovi2;

import java.util.Scanner;

public class primer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bj[] = new int [100];
		int bd[] = new int [100];
		
		int j,d,broj;
		
		for(int i = 1; i<10; i++) {
			bj[i] = 0;
			bd[i] = 0;
		}
		System.out.println("Koliko brojeva zelite da unesete? ");
		int n = sc.nextInt();
		
		System.out.println("Unesite brojeve");
		for(int i = 1; i<=n; i++) {
			broj = sc.nextInt();
			if(broj>0 && broj<100) {
				if(broj<10) {
					j = broj;
					bj[j]++;
				} else {
					d = broj / 10;
					j = broj % 10;
					bd[d]++;
					bj[j]++;
				}
			}
		}
		System.out.println("Cifra\tKao desetica\tKao jedinica");
		for(int i = 0; i<=9; i++) {
			System.out.println(i+"\t"+bd[i]+"\t\t"+bj[i]);
		}
		sc.close();
	}

}
