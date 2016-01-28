package pattern;

public class Subject {

	private String message;
	private Observer observer;

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setObserver(Observer observer){
		this.observer = observer;
	}

	public void notifyObserver(){
		observer.update();
	}

}
