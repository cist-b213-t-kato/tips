package oop2016.lec08;

public class Team {
	String teamName;
	Coach coach;
	
	void printCoach(){
		System.out.println(teamName + "のコーチを表示します"); 
		if(coach != null){
			coach.printName();
		}else{
			System.out.println("コーチはいません");
		}
	}
	
}
