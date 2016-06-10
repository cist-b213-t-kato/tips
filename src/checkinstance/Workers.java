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
        	h.recall();
        }
        
    }
    
//    public static void call(Human h){
//    	if(h instanceof Firefighter){
//            System.out.println("お疲れさまです消防士さん");
//        }else if(h instanceof Policeofficer){
//            System.out.println("お疲れさまですおまわりさん");
//        }else if(h instanceof Engineer){
//            System.out.println("お疲れさまですエンジニアさん");
//        }else if(h instanceof Neet){
//            System.out.println("働けニート");
//        }
//    }

    public static void call(Firefighter o){
        System.out.println("お疲れさまです消防士さん");
    }

    public static void call(Policeofficer o){
        System.out.println("お疲れさまですおまわりさん");
    }

    public static void call(Engineer o){
        System.out.println("お疲れさまですエンジニアさん");
    }

    public static void call(Neet o){
        System.out.println("働けニート");
    }
    
}

abstract class Human{
	public abstract void recall();
}

class Firefighter extends Human{
	@Override
	public void recall(){
		Workers.call(this);
	}
}
class Policeofficer extends Human{
	@Override
	public void recall(){
		Workers.call(this);
	}
}
class Engineer extends Human{
	@Override
	public void recall(){
		Workers.call(this);
	}
}
class Neet extends Human{
	@Override
	public void recall(){
		Workers.call(this);
	}
}
