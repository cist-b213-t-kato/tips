package ordeal.inoue;

import ordeal.inoue.jisaku;

import java.util.ArrayList;
import java.util.List;

public class jisaku3 extends jisaku {
    protected void execute(int size){
        List<Integer> PrimeNum = new ArrayList<>();
        PrimeNum.add(2);
        int tmp;
        System.out.println(1);
        for(Integer i=2;i<size;i++){
            tmp = i;
            for(Integer so: PrimeNum){
                if(i%so==0){
                    tmp = 1;
                    break;
                }
            }
            if(tmp!=1){
                PrimeNum.add(tmp);
            }
        }
        PrimeNum.forEach(s->System.out.println(s));
    }
}
