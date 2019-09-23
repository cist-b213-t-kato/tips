/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.ishimoto;


/**
 * 1～30までの素数を表示するクラス。
 * 
 */
public class Sosu extends Keisyou{
    @Override
    public void execute(){
        boolean b=true;
        System.out.println("1～30の素数");
        System.out.print("1");
        for(int i=2;i<=30;i++){
            b=true;
            for(int j =2; j < i; j++){
                if(i%j==0){
                    b=false;
                }
            }
            if(b){
                System.out.print(","+i);
            }
        }
        System.out.println("\n");
    }
}
