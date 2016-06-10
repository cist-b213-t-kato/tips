import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortApp {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();

		list.add(new Person("かとう", 21));
		list.add(new Person("フォッカー", 18));
		list.add(new Person("野獣先輩", 24));

		list.stream().map(o -> o.getName() + " " + o.getAge() + "歳").forEach(System.out::println);

		Collections.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());

		list.stream().map(o -> o.getName() + " " + o.getAge() + "歳").forEach(System.out::println);

	}
}
