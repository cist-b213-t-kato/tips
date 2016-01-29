package pattern;

public class App {
	public static void main(String[] args){
		AbstractMessage message = new AbstractMessage(){
			@Override
			protected void message() {
				System.out.println("よく来たな 光の勇者よ！");
				System.out.println("魔王JAIIDを倒し、この地に");
				System.out.println("光をもたらすのじゃ！"); 
			}
		};
		message.showMessage();
		
	}
	
}

