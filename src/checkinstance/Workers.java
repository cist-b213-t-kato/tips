package checkinstance;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author b2130480
 */
public class Workers {
    
    public static void main(String[] args){
        List<Human> humans = Arrays.asList(
            new Firefighter(),
            new Policeofficer(),
            new Engineer(),
            new Neet()
        );
        
        for(Human h : humans){
            Call(h);
        }
        
    }
    
    public static void Call(Human h){
    	if(h instanceof Firefighter){
            System.out.println("お疲れさまです消防士さん");
        }else if(h instanceof Policeofficer){
            System.out.println("お疲れさまですおまわりさん");
        }else if(h instanceof Engineer){
            System.out.println("お疲れさまですエンジニアさん");
        }else if(h instanceof Neet){
            System.out.println("働けニート");
        }
    }
    
}

interface Human{}
class Firefighter implements Human{}
class Policeofficer implements Human{}
class Engineer implements Human{}
class Neet implements Human{}
