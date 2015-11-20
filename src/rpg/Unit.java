package rpg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Unit {
    
    private Command command;    
    public final HitPoint hitPoint;
    public final Power power;
    public final Agility agility;
    public String name = "Noname";
    
    public Unit(String nm, int hp, int pw, int agl){
        name = nm;
        hitPoint = new HitPoint(hp);
        power = new Power(pw);
        agility = new Agility(agl);
        setCommand(new Command(null) {
            @Override
            public void execute() {
                System.out.println(getActor().name+": 何もしない");
            }
        });
    }
    
    public Unit(String name, HitPoint hp, Power pw, Agility agl){
        this.name = name;
        hitPoint = hp;
        power = pw;
        agility = agl;
        command = new Command(this) {
            @Override
            public void execute() {
                System.out.println("何もしない");
            }
        };
    }
    
    public void setCommand(Command command){
        command.setActor(this);
        this.command = command;
    }
    
    public void executes(){
        if(hitPoint.getValue()>0){
            command.execute();
        }
    }
    
//    public void reacts(Command command){
//        
//    }
    
    public void causeDamage(Command command){
        Unit attacker = command.getActor();
        int damage = attacker.power.getValue();
        hitPoint.setValue(this.hitPoint.getValue() - damage);
        System.out.println(name+"は"+damage+"のダメージをうけた！");
    }
    
}



