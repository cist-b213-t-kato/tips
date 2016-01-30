
public class Ensyuuritsu {

	public static void main(String[] args){
		System.out.println(calc());
		
	}

	/** ライプニッツの級数から円周率を求める **/
	public static double calc(){
		double pi = 0;
		double sig = 1;
		
		//このくらい繰り返してようやく3.14が求まる
		final double end = 750;
		
		for(double i=0; i<end; ++i){
			pi += 1/(1+i*2)*sig;
			sig = -sig;
		}
		
		return (4*pi);
	}

}
