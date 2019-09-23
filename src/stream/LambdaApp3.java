package stream;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class LambdaApp3 {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bi1 = (a, b) -> a + b;
		BiFunction<Integer, Integer, Integer> bi2 = (a, b) -> { return a + b; };
		BiFunction<Integer, Integer, Integer> bi3 = (Integer a, Integer b) -> a + b;
		BiFunction<Integer, Integer, Integer> bi4 = (Integer a, Integer b) -> { return a + b;};
//		BiFunction<Integer, Integer, Integer> bi5 = (Integer a, b) -> { return a + b;}; // NG
	}
}
