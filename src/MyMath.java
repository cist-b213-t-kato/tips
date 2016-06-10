import utils.Stopwatch;

public class MyMath {
	public static float root(float n){
		float x = n;
		while(true){
			float x2 = (n/x + x)/2;
			if((int)x == (int)x2){
				return x2;
			}else{
				x = x2;
			}
		}
	}
	
	public static void main(String[] args){
		
		Stopwatch.stopwatch(()->{
			for(int i=0; i<100000000; i++){
				Math.sqrt(i);
			}
		});
		
	}
	
}
