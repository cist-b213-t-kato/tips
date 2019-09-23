/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.hiramura;

/**
 *
 * @author b2161490
 */
public class PrimeNumber extends Execute {
    @Override
    public void execute(){
        int flag;
        for(int i=2;i<=30;i++){
            flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }
    }
}
