
public class h2_sander {
	
	public static void main(String[] args) {
		System.out.println(ellipsiS(5,10));
		aeg(126.0);
		System.out.println(vahe(kiirus(8,1),kiirus(6,1)));
	
	}
	
	//teisendab tollid meetriteks
	static double tollidM(int t) {
		double m = t * 0.0254;
		return m;
	
	}
		
	//Pindala leidmine
	static double ellipsiS(int a, int b) {
		double f = Math.PI * a * b;
		double s = Math.round(f*100.0)/100.0;
		System.out.println("Ellipsi pindala on " + s);
		return s;
	}
	
	//teisendamine
	static void aeg(double x) {
		double teisendamine = x / 60;
		double tteisendamine = x % 60;
		System.out.println("Tunnid " + teisendamine + " " + "Minutid " + tteisendamine);
	}
	
	//sport
	static double kiirus(int km, int h) {
		double k = km / h;
		return k;
		
		}
	static double vahe(double kiirus1, double kiirus2){
		double v = Math.abs(kiirus1 - kiirus2);
		return v;
		
	}
		
	
		
		
	
}