package designpattern.singleton2;

public class God {
    private static God inst;

    private God() {

    }

    public static God getInst() {
        if (inst == null) {
            inst = new God();
        }
        return inst;
    }

    public String name;

}
