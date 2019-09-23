package list;

import java.util.ArrayList;
import java.util.List;

public class NotGenericsListApp {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("A");
		list.add(null);
		list.add(1);

		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		method(list);

	}

	static void method(List l) {
		l.add("");
	}
}
