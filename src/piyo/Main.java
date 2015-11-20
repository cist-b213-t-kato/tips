package piyo;

/**
 *
 * @author b2130480
 */
public class Main {
    public static void Call(Human h){
        if(h instanceof Neet){
            System.out.println("働けニート");
        }else if(h instanceof Firefighter){
            System.out.println("お疲れさまです消防士さん");
        }else if(h instanceof Policeofficer){
            System.out.println("お疲れさまですおまわりさん");
        }else if(h instanceof Engineer){
            System.out.println("お疲れさまですエンジニアさん");
        }
    }
    
    public static void main(String[] args){
        Human hs[] = {
            new Firefighter(), new Policeofficer(), new Engineer(), new Neet()
        };
        
        for(Human h : hs){
            Call(h);
        }
        
    }
    
}

interface Human{}
class Firefighter implements Human{}
class Policeofficer implements Human{}
class Engineer implements Human{}
class Neet implements Human{}
