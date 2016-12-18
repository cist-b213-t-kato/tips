package designpattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args){

		List<Person> persons = new ArrayList<>();

		persons.add(new Person("ユウキ", 10));
		persons.add(new Person("アイ", 10));
		persons.add(Hitorikko.restoreInstance());

		for(Person p : persons){
			System.out.println("名前: " + p.getName());
			System.out.println("年齢: " + p.getAge());
			System.out.println();
		}

	}
}
