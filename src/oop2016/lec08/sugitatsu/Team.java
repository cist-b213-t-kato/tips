package oop2016.lec08.sugitatsu;

public class Team {
    
    String name;
    Coach coach;
    TeamMember[] member;
     
     
    void printCoach(){
        System.out.println(name + "のコーチを表示します");
        if(coach != null){
            coach.printName();
        }else{
            System.out.println("コーチはいません");
             
        }
    }
     
    void printMember(){
        System.out.println(name + "のメンバーを表示します");
        if(member != null){
            for(int i=0 ; i < member.length; i++){
                TeamMember members = member[i];
                members.printName();
            }
        }else{
            System.out.println("メンバーはいません");
        }
    }
}