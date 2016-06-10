package stream;

import java.util.stream.Stream;

public class FizzBuzzWriter {
	public static void main(String[] args) {
		// FizzBuzzの無限リスト
		Stream fizzbuzz = Stream.iterate(0, i -> i+1).map(i ->
			(i % 15 == 0) ? "Fizbuzz" :
			(i % 3 == 0) ? "Fizz" :
			(i % 5 == 0) ? "Buzz" :
			Integer.toString(i));

		// skipが起点、limitが表示数に対応する
		fizzbuzz.skip(1).limit(100).forEach(System.out::println);
	}
}