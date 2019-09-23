package ordeal.inoue;

import ordeal.inoue.jisaku;

public class jisaku1 extends jisaku {
    public void execute(int length){
        for(var i=0;i<=length;i++){
            if(i%15==0){
                System.out.println("Fizz Buzz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
