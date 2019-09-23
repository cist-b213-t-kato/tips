package exception;

public class ExceptionApp {

	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
//			e.printStackTrace();
		}

		methodB();

	}

	public static void methodA() throws Exception {
		throw new Exception();
	}

	public static void methodB() {
		throw new RuntimeException();
	}


}
