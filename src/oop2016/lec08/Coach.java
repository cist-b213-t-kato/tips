package oop2016.lec08;

public class Coach {
	String coachName;
	
	Coach(String coachName){
		this.coachName = coachName;
	}
	
	public void printName(){
		System.out.println("コーチは " + coachName + " です");
	}
	
}
