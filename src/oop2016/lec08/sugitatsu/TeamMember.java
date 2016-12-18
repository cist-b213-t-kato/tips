package oop2016.lec08.sugitatsu;

public class TeamMember {
	
	String member[];
	
	void TeamMember(String member[]){
		
		this.member = member;
	}
	
	void printName(){
		for(int i = 0; i > member.length; i++){
			System.out.println(member[i]);
		}
		
		
	}
	
	

}
