package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStream {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

		System.out.println(list.stream().reduce((a, b)-> a*b).get());

		list.stream().map(a -> a * a).forEach(o -> {
			System.out.print(o+" ");
		});

	}
}
