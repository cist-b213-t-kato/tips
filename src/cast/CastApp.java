package cast;

class A {
	public void method() {
		System.out.println("A");
	}
}

class B extends A {
	@Override
	public void method() {
		System.out.println("B");
	}
}

class C extends A {
	@Override
	public void method() {
		System.out.println("C");
	}
}

public class CastApp {
	public static void main(String[] args) {
//		A x = (C)(new B()); // できない

		A x = (A)(new B());

		x.method();
	}
}
