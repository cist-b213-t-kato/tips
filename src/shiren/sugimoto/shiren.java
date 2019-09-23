package shiren.sugimoto;

import java.util.ArrayList;
import java.util.List;

public class shiren {

    FizzBuzz fi;
    prime pr;
    tree tr;
    tree2 tr2;


    public static void main(String args[]) {
        List<Keisan> list = new ArrayList<>();
        list.add(new FizzBuzz());
        list.add(new tree());
        list.add(new prime());
        list.add(new tree2());
        list.stream().forEach(o -> o.execute());
    }
}
