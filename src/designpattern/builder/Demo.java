package designpattern.builder;

public class Demo {
	public static void main(String[] args) {

		Dog dog = new Dog.Builder("taro")
				.age(10)
				.build();

		System.out.println("name: " + dog.getName());
		System.out.println("age: " + dog.getAge());

	}
}
