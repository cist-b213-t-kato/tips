package hookpattern;

abstract class AbstractMessage {

	public void showMessage(){
		System.out.println("---------------------------------------");
		message();
		System.out.println("---------------------------------------");
		System.out.println();
	}

	abstract protected void message();
	
}