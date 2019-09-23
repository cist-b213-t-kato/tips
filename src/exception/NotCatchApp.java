package exception;

public class NotCatchApp {

	public static void ex() throws Exception {
		throw new Exception();
	}

	public static void rtex() {
		throw new RuntimeException();
	}

	public static void rtex2() {
		try {
			throw new RuntimeException();
		} catch(RuntimeException e) {
			System.out.println("rtex2!");
		}
	}

	public static void normal() {
		System.out.println("nomal!");
	}

	/**
	 * 検査例外を素のまま描こうとすると、コンパイルエラー
	 */
	public static void pattern1() {
//		ex(); // 素のままじゃ書けない
	}

	/**
	 * 非検査例外(実行時例外)に関しては、コンパイルが通る
	 */
	public static void pattern2() {
		rtex();
	}

	/**
	 * すでにキャッチされている非検査例外をtryで囲む
	 */
	public static void pattern3() {
		try {
			rtex2();
		} catch (RuntimeException ex) {

		}
	}

	/**
	 * 何も例外を起こさないメソッドをtryで囲む
	 */
	public static void pattern4() {
		try {
			normal();
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}

	public static void main(String[] args) {
		pattern4();
	}
}
