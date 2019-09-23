package shiren.iwasa.lec02;
/*
* アスタリスク(*)をツリー状に表示するプログラムです。
* Executeインターフェースを使用しています
*/
public class Tree implements Execute {

    @Override
    public void execute() {

        for(int i = 1; i <= 3; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            //改行
            System.out.println("");
        }
    }
}
