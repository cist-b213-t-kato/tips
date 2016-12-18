package stream;

public class LambdaApp {
	public static void main(String[] args) {
		IntFunc intfunc = x -> x * x;

		System.out.println(intfunc.func(4));

	}

}

interface IntFunc {
	public Integer func(int x);
}
