package polymo;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<Executer> list = new ArrayList<>();

		list.add(new SosuuExecuter());

		list.add(()->{
			System.out.println("tree");
		});

		list.add(()->{
			System.out.println("fizzbuzz");
		});

		list.stream().forEach(o->o.run());

	}
}
