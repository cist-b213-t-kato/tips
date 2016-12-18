package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SearchApp {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(13);
		list.add(27);
		list.add(4);
		
		Optional<Integer> opt = list.stream().parallel().filter(o->o>=10).findFirst();
		
		opt.ifPresent(o->System.out.println(o));
		
	}
}
