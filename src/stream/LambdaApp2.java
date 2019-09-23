package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class LambdaApp2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("red", "blue", "green");
		list.replaceAll(new UnaryOperator<String>() {
			@Override
			public String apply(String s) {
				return s.toUpperCase();
			}
		});
		list.replaceAll((String s) -> {return s.toUpperCase();});
		list.replaceAll((String s) -> s.toUpperCase());
		list.replaceAll(s -> {return s.toLowerCase();});
		list.replaceAll(s -> s.toUpperCase());
		System.out.println(list);
	}
}
