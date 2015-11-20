package exception_test;

//finallyくんの存在意義
public class ExceptionApp {
	public static void main(String[] args) {

		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("exception");
			return;
		} finally {
			System.out.println("finally");
		}

	}

}
