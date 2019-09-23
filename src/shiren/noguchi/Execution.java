package shiren.noguchi;

import java.util.ArrayList;
import java.util.List;

public class Execution {

    public static void main(String[] args){
        Summary fizzBuzz = new FizzBuzz();
        Summary tree = new Tree();
        Summary primeNumber = new PrimeNumber();
        List<Summary> list = new ArrayList<Summary>();

        list.add(fizzBuzz);
        list.add(tree);
        list.add(primeNumber);
        list.stream().forEach(o->o.execute());
    }
}
