package ordeal.inoue;

import java.util.ArrayList;
import java.util.List;

public class siren2 {

    public static void main(String arg[]){
        List<jisaku> list = new ArrayList<>();
        list.add(new jisaku1());
        list.add(new jisaku2());
        list.add(new jisaku3());
        list.forEach(o->o.execute(30));
    }
}
