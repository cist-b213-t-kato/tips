package shiren.iwasa.lec02;

/*
* 3の倍数、5の倍数、3と5の倍数を求めるクラスです。
* Executeインターフェースを使用しています
*/
public class FizzBuzz implements Execute {


    @Override
    public void execute() {

        //1〜30までのFizzBuzzを求める
        for(int i = 1; i <= 30; i++){

            //3と5の倍数の場合
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " = FizzBuzz");
            }
            //3の倍数の場合
            else if(i % 3 == 0){
                System.out.println(i + " = Fizz");
            }
            //5の倍数の場合
            else if(i % 5 == 0){
                System.out.println(i + " = Buzz");
            }
            //エラー処理
            else{
                System.exit(1);
            }

        }
    }
}
