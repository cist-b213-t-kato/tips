package rpg;

class AttackCommand extends Command{
    public AttackCommand(Unit t) {
        super(t);
    }
    @Override
    public void execute() {
        Unit target = getTarget();
        Unit actor = getActor();
        System.out.println(actor.name+"の攻撃！");
        target.causeDamage(this);
    }
}
