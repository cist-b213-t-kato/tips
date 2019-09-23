package ordeal.inoue;

import ordeal.inoue.jisaku;

public class jisaku2 extends jisaku {
    protected void execute(int jiku){
        var width=1;
        for(;0<jiku;jiku--){
            for(int i=0;i<jiku;i++){
                System.out.print(" ");
            }
            for(int i=0;i<width;i++){
                System.out.print("*");
            }
            System.out.print("\n");
            width+=2;
        }
        var height = (width-1)/6;
        for(int j=0;j<(width-1)/5;j++){

            for(int i=0;i<height*2;i++){
                System.out.print(" ");
            }
            for(int i=0;i<height*2;i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
