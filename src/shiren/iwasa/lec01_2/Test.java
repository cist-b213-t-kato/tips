package shiren.iwasa.lec01_2;
/*
* Gaugeクラスを継承して作成するテストクラス
* Gaugeクラスをabstractにしたので継承して動作することを確認。
*/
public class Test extends Gauge {

    //Gaugeクラスのコンストラクタを呼び出す。
    Test(){
        super();
    }

    //valueの値を表示する。
    @Override
    void showValue() {
        System.out.println(this.value);
    }
}
