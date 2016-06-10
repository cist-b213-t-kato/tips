package tdd;

public class Calculator {

	public double addition(double leftSide, double rightSide){
		return leftSide + rightSide;
	}
	
	public double subtraction(double leftSide, double rightSide){
		return 0;
	}
	
	public double multiplication(double leftSide, double rightSide){
		return 0;
	}
	
	public double division(double leftSide, double rightSide){
		if(rightSide==0){
			throw new IllegalArgumentException();
		}else{
			return leftSide/rightSide;
		}
	}
	
	public boolean isYoung(int age){
		if(age < 0){
			throw new RuntimeException();
		}
		if(age < 20){
			return true;
		}else{
			return false;
		}
	}
	
}
