package shiren.iwasa.lec02;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String... args) {

        List<Execute> list = new ArrayList<Execute>();

        list.add(new FizzBuzz());
        list.add(new Tree());
        list.add(new PrimeNum());

        list.stream().forEach(o->o.execute());

    }
}