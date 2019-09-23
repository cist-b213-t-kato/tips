package list;

import java.util.ArrayList;
import java.util.List;

public class AddApp {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("1");
		list.add("2");

		System.out.println((String)list.get(0) + (String)list.get(1));

	}
}
