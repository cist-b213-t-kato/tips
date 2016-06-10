package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Data{
	int numb;
}

public class UnlimitedStream {
	
	public static void main(String[] args) {
		
		List<Data> list = new ArrayList<>();

		list.add(new Data());
		list.add(new Data());
		list.add(new Data());

		Stream.iterate(0, i -> i + 1).limit(10)
			.parallel().forEach(i -> System.out.print(i + " "));

	}
}
