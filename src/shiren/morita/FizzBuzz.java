package shiren.morita;

public class FizzBuzz extends Execute{

	Gauge gauge = new Gauge();
	private int num;
	private int firstNum;

	public FizzBuzz(int value){
		gauge.setValue(value);
	}

	public void execute(){

		firstNum = gauge.getValue();

		System.out.println("\n---FuzzBuzz---");
		for(num=gauge.getValue(); num< firstNum + 30; num++ ){
			if(num%3 ==0 &&num%5==0){
				System.out.println("FizzBuzz");
			}
			else if(num%3==0){
				System.out.println("Fizz");
			}
			else if(num%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(num);
			}
		}

		System.out.println("--------");
	}


}
