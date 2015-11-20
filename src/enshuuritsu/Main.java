package enshuuritsu;
public class Main {

	public static void main(String[] args){
		calc();
	}

	/** ライプニッツの級数から円周率を求める **/
	public static void calc(){
		double pi = 0;
		double sig = 1;
		for(int i=0; i<1000; ++i){
			pi += (double)1/(1+i*2)*sig;
			sig = -sig;
		}
		System.out.println(4*pi);
	}

}
