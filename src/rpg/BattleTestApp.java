package rpg;

import java.util.ArrayList;
import java.util.List;

public class BattleTestApp {
    
    public static void main(String[] args){
        
        //Unitを作る
        List<Unit> list = new ArrayList<>();
        list.add(new Unit("勇者", 50, 12, 25));
//        list.add(new Unit("魔法使い", 20, 30));
        list.add(new Unit("野獣先輩", 52, 2, 35){
            @Override
            public void causeDamage(Command command) {
                super.causeDamage(command);
                if(hitPoint.getValue()<=0){
                    System.out.println(name+"「お前のことが好きだったんだよ…（遺言）」");
                    System.out.println(name+"は生命活動を停止…死んだのだ");
                }else if(hitPoint.getValue()<=hitPoint.getMaxValue()/9){
                    System.out.println(name+"「ｱｰｲｷｿ」");
                }else{
                    System.out.println(name+"「やりますねえ！（賞賛）」");
                }
            }
        });
        
        //コマンド入力        
        list.get(0).setCommand(new AttackCommand(list.get(1)));
        list.get(1).setCommand(new AttackCommand(list.get(0)));
        
        //すばやさ順にソートし全てコマンドさせる
        List<Unit> battleMember = new ArrayList<>(list);
        battleMember.sort((u1,u2)->(u2.agility.getValue()-u1.agility.getValue()));
        battleMember.forEach(u->u.executes());    
    }
}
