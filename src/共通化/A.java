package 共通化;

public class A {
	void method1(){
		System.out.println("A.method1()");
		B.method();
	}
	
	void method2(){
		System.out.println("A.method2()");
		B.method();
	}
	
}
