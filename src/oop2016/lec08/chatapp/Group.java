package oop2016.lec08.chatapp;

public class Group {
	String groupName;
	Account[] accounts;
	Message[] messages;
	
	Group(String groupName){
		this.groupName = groupName;
	}
	
	void printState(){
		printAccounts();
		printMessages();
	}
	
	void printAccounts(){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(groupName);
		sb.append(" のアカウントは\n");
		
		if(accounts==null){
			sb.append("存在しません\n");
		}else{
			for(Account account : accounts){
				sb.append(account.accountName);
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		
	}
	
	void printMessages(){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(groupName);
		sb.append(" のメッセージは\n");

		if(messages==null){
			sb.append("存在しません\n");
		}else{
			for(Message message : messages){
				sb.append(message.getMessage());
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		
	}
	
}
