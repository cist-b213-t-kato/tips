package shiren.iwasa.lec01_2;

/* 試練1の内容を書き込んだソースコード。
*  1.整数型:valueがあること
*  2.Gaugeクラスはあなた以外が書き換えることはできないものの、Gaugeクラスを使用する他のクラスに関しては、多様な書き方が許されるものとする。
*  を満たすようにクラスを作っています
*
*  (2については「Gaugeクラスを書きかえず他のクラスで操作できるようにする = implements OR abstractを使え」 と解釈ました。
*  解釈が間違っていたら頭を叩いていいです)
*/
public abstract class  Gauge {

     int value;

    //valueに0～999の数字を入力して判定するメソッド
    public Gauge(){

        //0～999の数字を入れない限り繰り返し
        while(true){
            System.out.print("valueを入力");
            try{
                //valueを入力
                value = new java.util.Scanner (System.in).nextInt();
                //0～999であればwhileから抜ける
                if(0 <= value && value <= 999 ){
                    this.value = value;
                    break;
                }
            } catch(NumberFormatException e){}
        }
    }

    //入力したvalueの値を表示するために用意。子クラスで実装。
    abstract void showValue();
}
