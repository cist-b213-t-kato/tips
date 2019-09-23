package designpattern.builder;

/**
 *
 * @see http://promamo.com/?p=4176
 * @author tkato
 *
 */
public class Dog {

	private final String name;
	private final int age;

	private Dog( Builder builder ) {
		this.name = builder.name;
		this.age = builder.age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static class Builder {

		private final String name;
		private int age;

		public Builder( String name ) {
			this.name = name;
		}

		public Builder age( int age ) {
			this.age = age;
			return this;
		}

		public Dog build() {
			return new Dog(this);
		}

	}

}
