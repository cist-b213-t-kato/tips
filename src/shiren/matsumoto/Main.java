package shiren.matsumoto;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Execute[] allTest = Alltest.getTest(1);

        ArrayList<Execute> list = new ArrayList<>(Arrays.asList(allTest));

        list.stream().forEach(o->o.execute());

    }
}
