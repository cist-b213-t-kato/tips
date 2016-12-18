package 共通化;

public class C extends A {
	
	@Override
	void method1() {
		super.method1();
		System.out.println("C.method1()");
	}
	
	@Override
	void method2() {
		super.method2();
		System.out.println("C.method2()");
	}
	
}
