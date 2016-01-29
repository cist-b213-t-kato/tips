package observerpattern;

public abstract class Observer {
	protected Subject subject;

	public void putSubject(Subject subject){
		this.subject = subject;
		subject.setObserver(this);
	}

	public abstract void update();
}
