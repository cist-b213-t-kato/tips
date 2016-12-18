package oop2016.lec08;

public class OneToOneApp {
	public static void main(String[] args) {
		Team teamA = new Team();
		teamA.teamName = "チームA";
		
		Coach coachA = new Coach();
		coachA.coachName = "大森";
		teamA.coach = coachA;
		
		teamA.printCoach();
		
		Team teamB = new Team();
		teamB.teamName = "チームB";
		
		Coach coachB = new Coach();
		coachB.coachName = "渚";
		teamB.coach = coachB;
		
		teamB.printCoach();
		
	}
}
