package stream;

import java.util.stream.Stream;

public class UnlimitedStream {
	
	public static void main(String[] args) {
		
		Stream.iterate(0, i -> i + 1).limit(10)
			.forEach(i -> System.out.print(i + " "));
		
		System.out.println();

		Stream.iterate(0, i -> i + 1).limit(10)
			.parallel().forEach(i -> System.out.print(i + " "));
	}
}
