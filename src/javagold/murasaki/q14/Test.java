package javagold.murasaki.q14;

public abstract class Test {
	String s1;
	public abstract final void foo();
	public static void main(String[] agrs) {
		Test obj = new ExTest();
		obj.s1 = "hello"; obj.foo();
	}

	public static class ExTest extends Test {
		@Override
		public final void foo() { System.out.println(s1); }
	}
}
