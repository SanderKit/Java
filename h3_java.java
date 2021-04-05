package sander_java;

public class h3_java {
	
	public static void main(String[] args) {
	//numbrid
	int[] arv = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};
	for (int i = 0; i < arv.length; i++) {
	//prindib välja numbrid tühikuga
	System.out.print(arv[i]+" ");
	}
	int arvudKokku = arv.length; 
	int viimaneArv = arv[arvudKokku-1];
	System.out.println("\nEsimene number: "+arv[0]);
	System.out.println("Viimane number: "+viimaneArv);
	System.out.println("Arvud kokku: "+arvudKokku);
	int summa = 0;
	for(int num : arv) {
		summa = summa+num;
	}
	System.out.println("Summa kokku: "+summa);
	}
	
	
}