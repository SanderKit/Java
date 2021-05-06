package sander_java;
import java.util.Scanner;
public class h5_sander {
		
	
	public static void main(String[] args) {
		divide();

	}
				
	public static void divide() {
		Scanner input = new Scanner (System.in);
		System.out.print("Sisestage esimene arv: ");
		double arv = input.nextDouble();
		System.out.print("Sisestage teine arv: ");
		double arv1 = input.nextDouble();
		
		if (arv1 == 0) { 
			System.out.println("Nulliga ei saa jagada");
		} else {
			double vastus = arv/arv1;
		System.out.println("Vastus: "+vastus);
		}
	}
			
}