package rpg;

abstract class Command {
    private Unit actor;
    private Unit target;
    
    public Command(Unit t){
        target = t;
    }
    
    abstract public void execute();
//    public void executeTo(Unit target){}
//    ダメです
//    理由：あらかじめセットしておき、後から実行するという動作ができない
    
    public void setActor(Unit actor){
        this.actor = actor;
    }
    
    public final Unit getActor(){
        return actor;
    }

    public void setTarget(Unit target) {
        this.target = target;
    }
    
    public final Unit getTarget(){
        return target;
    }
    
}