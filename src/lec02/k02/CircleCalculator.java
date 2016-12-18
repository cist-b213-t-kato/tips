package lec02.k02;

class Circle {
	private double r;
	public static final double PIE = 3.14159265358979323846264;
	
	public Circle(double r){
		this.r = r;
	}
	
	public double getCircumference(){
		return 2 * r * PIE;
	}
	
	public double getArea(){
		return r * r * PIE;
	}
	
}

public class CircleCalculator {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(2);
		
		System.out.println("円周は" + circle.getCircumference());
		System.out.println("円の面積は" + circle.getArea());
		
	}	
	
	
}



