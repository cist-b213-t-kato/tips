package fizzbuzz;

//FizzBuzz問題の解答例
public class FizzBuzzApp {
	public static void main(String args[]) {
		type2();
	}

	public static void type1(){
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void type2(){
		for (int i = 1; i <= 30; i++) {
			if(i % 3 == 0){
				System.out.print("fizz");
			}
			if(i % 5 == 0){
				System.out.print("buzz");
			}
			if(!(i % 3 == 0 || i % 5 == 0)){
				System.out.print(i);
			}
			System.out.println();
		}
	}

}