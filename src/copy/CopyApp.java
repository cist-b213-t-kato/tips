package copy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Cat implements Cloneable {

	private String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Cat clone() {
		try {
			return (Cat)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}

public class CopyApp {

	public static void main(String[] args) {

		List<Cat> catList = new ArrayList<>();

		catList.add(new Cat("アイ", 3));
		catList.add(new Cat("シロ", 1));
		catList.add(new Cat("アカリ", 21));

//		List<Cat> copyList = catList.stream().collect(Collectors.toList());
		List<Cat> copyList = catList.stream().map(bean->bean.clone()).collect(Collectors.toList());

		catList.get(0).setAge(32);
//		catList.remove(1);

		catList.forEach(bean->System.out.println(bean.getName() + bean.getAge()));
		System.out.println();
		copyList.forEach(bean->System.out.println(bean.getName() + bean.getAge()));

	}

}




