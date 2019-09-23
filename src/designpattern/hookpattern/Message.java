package designpattern.hookpattern;

abstract class Message {

	public void showMessage(){
		System.out.println("---------------------------------------");
		message();
		System.out.println("---------------------------------------");
		System.out.println();
	}

	abstract protected void message();
	
}