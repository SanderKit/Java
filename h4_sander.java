package sander_java;
import java.util.Scanner;

public class h4_sander {

	public static void main(String[] args) {
		try (Scanner text = new Scanner (System.in)) {
			System.out.print("Sisesta tekst: ");
			String tekst = text.nextLine();
			System.out.println("Lause mille sisestasite on: "+tekst);
			System.out.println(tekst.toUpperCase());
			String[] tykeldus = tekst.split(" ");
			System.out.println("S�nade arv: "+tykeldus.length);
			int tahed = 0;
			for (int i = 0; i < tykeldus.length; i++) {
				tahed += tykeldus[i].length();
				
			}
			System.out.println("T�htede arv: "+tahed);
			System.out.println("Esimene s�na: "+tykeldus[0]);			
			System.out.printf("%9s",tykeldus[0]);
		}
	 }
}