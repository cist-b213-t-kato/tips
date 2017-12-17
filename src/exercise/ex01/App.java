package exercise.ex01;

public class App {

	public static void main(String[] args) {
		DecoratePrinter printer = new DecoratePrinter() {
			@Override
			public void print() {
				System.out.println("hello, world!");
			}
		};

		printer.decoratePrint();

	}

}
