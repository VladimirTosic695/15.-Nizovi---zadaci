package Nizovi2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class primer17 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat ("#.###");
		
		double bod;
		int brojRadnika;
		
		double rata [] = new double [100];
		double plata [] = new double [100];
		double clanarina [] = new double [100];
		double brojBodova [] = new double [100];
		String ime [] = new String [100];
		
		System.out.println("Unesite vrednost boda");
		bod = Double.parseDouble(bf.readLine());
		
		System.out.println("Unesite broj radnika za koje se racuna plata");
		brojRadnika = Integer.parseInt(bf.readLine());
		
		System.out.println("Unesite Ime, broj bodova, ratu kredita i clanarinu za svakog radnika");
		for(int i = 1; i<=brojRadnika; i++) {
			System.out.println(i+". radnik");
			System.out.print("Ime: ");
			ime[i] = bf.readLine();
			System.out.print("Broj bodova: ");
			brojBodova[i] = Double.parseDouble(bf.readLine());
			System.out.print("Rata kredita: ");
			rata[i] = Double.parseDouble(bf.readLine());
			System.out.print("Clanarina: ");
			clanarina[i] = Double.parseDouble(bf.readLine());
		}
		double ukupnaSuma = 0;
		for(int i = 1; i<=brojRadnika; i++) {
			plata[i] = brojBodova[i] * bod - rata[i] - clanarina [i];
			ukupnaSuma += plata[i];
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Ime\tBroj bodova\tKreditna rata\tClanarina\tPlata");
		for(int i = 1; i<=brojRadnika; i++) {
			System.out.println(ime[i]+"\t"+brojBodova[i]+"\t\t"+rata[i]+"\t\t"+clanarina[i]+"\t\t"+plata[i]);
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Ukupno za isplatu \t\t\t\t\t"+ukupnaSuma);
	}

}
