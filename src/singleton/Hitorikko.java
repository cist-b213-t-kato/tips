package singleton;

public class Hitorikko extends Person {

	private static Hitorikko myself = new Hitorikko("リツコ", 10);

	private Hitorikko(String name, int age){
		super(name, age);
	}

	public static Hitorikko restoreInstance(){
		return myself;
	}
}
