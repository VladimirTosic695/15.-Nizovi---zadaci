package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primer18 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost n");
		int n = Integer.parseInt(bf.readLine());
		
		double x [] = new double [100];
		double y [] = new double [100];
		char oblast [] = new char [100];
		
		System.out.println("Unesite koordinate x i y");
		for(int i = 1; i<=n; i++) {
			System.out.println(i+". unos koordinata");
			System.out.print("x["+i+"] = ");
			x[i] = Double.parseDouble(bf.readLine());
			System.out.print("y["+i+"] = ");
			y[i] = Double.parseDouble(bf.readLine());
		}
 		
		for(int i = 1; i<=n; i++) {
			boolean k1 = Math.pow((x[i] - 1),2) + y[i]*y[i] <=1;
			boolean k2 = Math.pow((x[i] - 1),2) + Math.pow((y[i] - 1),2) <=1;
			boolean k3 = x[i]*x[i] + Math.pow((y[i] - 1),2) <=1;
			
			if(k1 && k3 && !k2) {
				oblast[i] = 'A';
			} else if(k1 && k2 && !k3) {
				oblast[i] = 'B';
			} else if(k2 && k3 && !k1) {
				oblast[i] = 'C';
			} else {
				oblast[i] = '*';
			}
		}
		System.out.println("R.BR.\tX\tY\tOblast");
		for(int i = 1; i<=n; i++) {
			System.out.println(i+"\t"+x[i]+"\t"+y[i]+"\t"+oblast[i]);
		}

	}

}
