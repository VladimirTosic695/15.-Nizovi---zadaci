package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primer9 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double b [] = new double [100];
		double h [] = new double [100];
		double L [] = new double [100];
		
		System.out.println("Unesite broj stapova m");
		int m = Integer.parseInt(bf.readLine());
		
		System.out.println("Unesite dimenzije poprecnih preseka b i h i duzinu stapa L");
		for(int i = 1; i<=m; i++) {
			do {
				System.out.println(i+". stap");
			System.out.println("b["+i+"] = ");
			b[i] = Double.parseDouble(bf.readLine());
			System.out.println("h["+i+"] = ");
			h[i] = Double.parseDouble(bf.readLine());
			System.out.println("L["+i+"] = ");
			L[i] = Double.parseDouble(bf.readLine());
			} while(h[i]>b[i]);
		}
		
			System.out.println("b\th\tL\tvitkost");
		for(int i = 1; i<=m; i++) {
			double F = b[i] * h[i];
			double Imin = Math.pow(b[i], 3) * h[i] * 1/12;
			double imin = Math.sqrt(Imin/F);
			double lambda = L[i] / imin;
		
		if(lambda>50)
			System.out.println(b[i]+"\t"+h[i]+"\t"+L[i]+"\t"+lambda);
		}

	}

}
