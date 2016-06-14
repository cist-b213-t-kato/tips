package prime_number;

import java.util.stream.Stream;

import utils.Stopwatch;

public class PrimeChecker2 {

	public static void main(String[] args) {
		
		Stopwatch.stopwatch(()->{
			enumeratePN();
		});
		
	}
	
	public static void enumeratePN(){
		StringBuilder sb = new StringBuilder();
		sb.append("2 3 ");
		Stream.iterate(1, i->i+1).limit(100000000/6).parallel().forEachOrdered(i->{
			if (PrimeChecker2.mainRoutine(6*i-1)) {
				sb.append(6*i-1);
				sb.append(" ");
			}
			if (PrimeChecker2.mainRoutine(6*i+1)) {
				sb.append(6*i+1);
				sb.append(" ");
			}
			if(i%10==0){
				sb.append("\n");
			}
		});
		System.out.println(sb.toString());
	}
	
	private static boolean mainRoutine(int number){
		for (int i=1;; ++i) {
			if (6 * i - 1 > Math.sqrt(number)) {
				return true;
			}
			if (number % (6 * i + 1) == 0 || number % (6 * i - 1) == 0) {
				return false;
			}
		}
	}
	
	public static boolean isPN(int number) {
		if(number == 2 || number == 3) {
			return true;
		}
		if(number % 6 != 1 && number % 6 != 5){
			return false;
		}
		return mainRoutine(number) && number!=1;
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
