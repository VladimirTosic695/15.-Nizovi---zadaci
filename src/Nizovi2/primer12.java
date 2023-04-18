package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class primer12 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat ("#.###");
		
		double x[] = new double [100];
		double eps = 10E-5;
		
		System.out.println("Unesite dimenziju niza n");
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i<=n; i++) {
			System.out.println("x["+i+"] = ");
			x[i] = Double.parseDouble(bf.readLine());
		}
		
		System.out.println("I\tX(I)\tS(X(I))");
		for(int i = 1; i<=n; i++) {
			double k =1;
			double s = Math.abs(Math.sin(x[i]/k) - Math.pow(Math.cos(x[i]), 2)) / (k*k+1);
			
			while (Math.abs(s) <= eps) {
				k++;
				s+= Math.abs(Math.sin(x[i]/k) - Math.pow(Math.cos(x[i]), 2)) / (k*k+1);
			}
			System.out.println(i+"\t"+df.format(x[i])+"\t"+df.format(s));
		}

	}

}
