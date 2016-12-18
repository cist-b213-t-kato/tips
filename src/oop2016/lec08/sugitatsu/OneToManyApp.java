package oop2016.lec08.sugitatsu;

public class OneToManyApp {
	public static void main(String[] args){
		
        Coach coach1 = new Coach();
        coach1.name = "大森";
         
        Coach coach2 = new Coach();
        coach2.name = "渚";
         
         
//        TeamMember[] member1 = {'新田','浜口','粟田'};
//        TeamMember[] member2= {'中井','木村'};
         
         
        Team[] circle = new Team[2];
         
        circle[0] = new Team();
        circle[0].name = "Aチーム";
        circle[0].coach = coach1; 
         
        circle[1] = new Team();
        circle[1].name = "Bチーム";
        circle[1].coach = coach2;
         
        circle[0].printCoach();
        circle[1].printCoach();
		
		
	}

}
