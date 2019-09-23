/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.kudo;
/**
 *
 * 「*」を用いてスリーを作成、表示するためのクラス
 */
public class Tree extends Keisyou{
    @Override
    public void execute(){
      for(int i=1;i<=6;i++){
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
      }
    }
}
