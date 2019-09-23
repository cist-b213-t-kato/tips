package shiren.kusunoki;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    private static int number = 30;

    public static void main(String[] args) {


        ArrayList<Execute> list = new ArrayList<>(Arrays.asList(new FizzBuzz(number), new Tree(number), new PrimeNumbers(number)));

        list.stream().forEach(o -> o.execute());
    }
}

