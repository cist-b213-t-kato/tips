package observerpattern;

public class App {
	public static void main(String[] args){

		Subject subject = new Subject();

		AsteriskObserver observer = new AsteriskObserver();
		observer.putSubject(subject);

		subject.setMessage("hoge");
		subject.notifyObserver();


	}
}


class AsteriskObserver extends Observer{

	@Override
	public void update() {
		System.out.println("** "+subject.getMessage()+" **");
	}

}