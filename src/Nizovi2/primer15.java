package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class primer15 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat ("#.###");
		
		System.out.println("Unesite vrednost za n");
		double n = Double.parseDouble(bf.readLine());
		
		double x [] = new double [100];
		
		System.out.println("Unesite elemenete niza x");
		for(int i = 1; i<=n; i++) {
			System.out.print("x["+i+"] = ");
			x[i] = Double.parseDouble(bf.readLine());
		}
		
		double s = 0;
		for(int i = 1; i<=n; i++) {
			s+= x[i];
		}
		
		double xsr = s/n;
		
		double v = 0;
		for(int i = 1; i<=n; i++) {
			v += Math.pow(x[i]-xsr, 2);
		}
		v = v / (n-1);
			System.out.println(" V = "+df.format(v));
	}

}
