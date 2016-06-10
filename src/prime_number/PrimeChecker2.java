package prime_number;

import utils.Stopwatch;

public class PrimeChecker2 {

	public static void main(String[] args) {
		
		Stopwatch.stopwatch(()->{
//			System.out.println(2);
//			System.out.println(3);
//			for(int i=1; i<100000/6; ++i){
//				if(f(6*i-1)){
//					System.out.println(6*i-1);
//				}
//				if(f(6*i+1)){
//					System.out.println(6*i+1);
//				}
//			}
			enumeratePN();
		});
		
	}
	
	public static void enumeratePN(){
		System.out.print(2+" "+3+" ");
		for (int i = 1; 6*i-1 < 10000000; ++i) {
			if (PrimeChecker2.mainRoutine(6*i-1)) {
				System.out.print(6*i-1 + " ");
			}
			if (PrimeChecker2.mainRoutine(6*i+1)) {
				System.out.print(6*i+1 + " ");
			}
			if(i%20==0){
				System.out.println();
			}
		}
		System.out.println();
	}
	
	private static boolean mainRoutine(int number){
		for (int i=1;; ++i) {
			if (6 * i - 1 > Math.sqrt(number)) {
				return number != 1;
			}
			if (number % (6 * i + 1) == 0 || number % (6 * i - 1) == 0) {
				return false;
			}
		}
	}
	
	public static boolean isPN1(int number) {
		if(number == 2 || number == 3) {
			return true;
		}
		if(number % 6 != 1 && number % 6 != 5){
			return false;
		}
		return mainRoutine(number);
	}
	
	public static boolean f(int n){
		for(int i=1;++i<=n/2;)if(n%i==0)n=0;return n>1;
	}
	
	public static void method(){
		for(int i,j=1;++j<100000;){
			for(i=2;i<=j/2;++i)if(j%i==0)break;
			if(i>j/2)System.out.println(j);
		}
		
	}
	
}
