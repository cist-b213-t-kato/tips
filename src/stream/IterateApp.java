package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateApp {
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("x", s -> s + s);

		List<String> list = stream.limit(3).collect(Collectors.toList());

		list.forEach(System.out::println);

		Stream.iterate(2, i -> i + i).limit(10).forEach(i->System.out.println(i));

	}
}
