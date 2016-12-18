package oop2016.lec08.chatapp;

public class ChatApp {
	public static void main(String[] args) {
		
		Group group1 = new Group("雑談グループ");
		
		group1.accounts = new Account[]{
				new Account("太郎"),
				new Account("花子"),
				new Account("次郎")
		};
		
		group1.messages = new Message[]{
				new Message(group1.accounts[0], "こんにちは！", new Time(13, 15)),
				new Message(group1.accounts[1], "はじめまして！", new Time(13, 16)),
				new Message(group1.accounts[1], "I'm hanako.", new Time(13, 17)),
				new Message(group1.accounts[2], "I'm so happy.", new Time(13, 18)),
		};
		
		group1.printState();
		
		Group group2 = new Group("打ち合わせグループ");
		group2.printState();
		
	}
	
}
