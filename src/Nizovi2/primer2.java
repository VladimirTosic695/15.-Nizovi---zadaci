package Nizovi2;

import java.io.*;

public class primer2 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite dimenziju n niza");
		int n = Integer.parseInt(bf.readLine());
		
		double x [] = new double [100];
		double y [] = new double [100];
		char oblast [] = new char [100];
		System.out.println("Unesite koordinate x i y");
		for(int i = 0; i<n; i++) {
			System.out.print("x["+i+"] = ");
			x[i] = Double.parseDouble(bf.readLine());
			System.out.print("y["+i+"] = ");
			y[i] = Double.parseDouble(bf.readLine());

		boolean k1 = Math.pow(x[i]-1, 2) + y[i]*y[i] <= 1;
		boolean k2 = Math.pow(x[i]-2, 2) + y[i]*y[i] <= 1;
		
		if(k1 && !k2) {
			oblast[i] = '1';
		}else if (k1 && k2) {
			oblast[i] = '2';
		} else if(!k1 && k2) {
			oblast[i] = '3';
		} else {
			oblast[i] = '*';
		}
		}
		System.out.println("\tR.BR.\tX\tY\tOblast");
		for(int i = 0; i<n; i++) {
			System.out.println("\t"+(i+1)+"\t"+x[i]+"\t"+y[i]+"\t"+oblast[i]);
		}
	}

}
