package 共通化;

/**
 * 誤った共通化 に対する僕なりの答え
 * @author hagure
 * @see http://irof.hateblo.jp/entry/20120709/p1
 */
public class App {
	public static void main(String[] args) {
		
		A c = new C();

		c.method1();
		c.method2();
		
	}
}
