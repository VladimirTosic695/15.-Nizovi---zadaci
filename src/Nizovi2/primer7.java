package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primer7 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite ukupan broj kuca za dostavu pisma u ulici");
		int broj = Integer.parseInt(bf.readLine());
		
		int neparni [] = new int [1000];
		int parni [] = new int [1000];
		int p = 0, n = 0;
		
		System.out.println("Unesite brojeve kuca kojim treba dostaviti pismo");
		for(int i = 0; i<broj; i++) {
			System.out.print((i+1)+". ");
			int x = Integer.parseInt(bf.readLine());
			if(x%2==0) {
				parni[p++] = x;
			} else {
				neparni[n++] = x;
			}
		}
		
		System.out.println("Parni brojevi kuca ");
		for(int i = 0; i<p; i++) {
				System.out.print(parni[i]+", ");
		}
		System.out.println("\nNeparni brojevi kuca ");
		for(int i = 0; i<n; i++) {
				System.out.print(neparni[i]+", ");
			
		}
	}

}
