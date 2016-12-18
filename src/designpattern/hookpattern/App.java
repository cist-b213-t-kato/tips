package designpattern.hookpattern;

public class App {
	public static void main(String[] args){
		AbstractMessage message = new AbstractMessage(){
			@Override
			protected void message() {
				System.out.println("よく来たな 光の勇者よ！");
				System.out.println("魔王JAIIDを倒し、この世界に");
				System.out.println("光をもたらすのじゃ！"); 
			}
		};
		message.showMessage();
		
		AbstractMessage message2 = new AbstractMessage(){
			@Override
			protected void message() {
				System.out.println("おお！勇者よ");
				System.out.println("死んでしまうとは何事だ！");
			}
		};
		message2.showMessage();
		
		AbstractMessage message3 = new AbstractMessage(){
			@Override
			protected void message() {
				System.out.println("とまあ、このようにすることで、サブクラスのメソッドの処理の前後に");
				System.out.println("スーパークラスの処理をすることを強制できる。");
				System.out.println("これはメッセージフック(？)とか呼ばれる手法だったと思う。");
			}
		};
		message3.showMessage();
		
	}
	
}

