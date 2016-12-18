package oop2016.lec08.chatapp;

public class Message {
	Account account;
	String text;
	Time time;

	Message(Account account, String text, Time time){
		this.account = account;
		this.text = text;
		this.time = time;
	}
	
	String getMessage(){
		return new StringBuilder()
				.append(account.accountName)
				.append("：")
				.append(text)
				.append("（")
				.append(time.getTime())
				.append("）")
				.toString();
	}
	
}
