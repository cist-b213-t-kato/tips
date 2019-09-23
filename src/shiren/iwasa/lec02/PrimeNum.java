package shiren.iwasa.lec02;
/*
* 1〜30までの素数を求めるクラスです
* Executeインターフェースを使用しています
*/
public class PrimeNum implements Execute {
    @Override
    public void execute() {

        /*
        * 2〜30までの素数を求める。
        * 1は素数ではないので2から始めています
        */
        for (int j = 2; j <= 30; j++) {
            int i;

            for (i = 2; i < j; i++) {
                // 素数ではないので繰返しは不要
                if (j % i == 0){
                    break;
                }
            }

            // 最後まで割り切れなかった場合は素数
            if (j == i)
                System.out.println(j + "は素数です");
        }
    }
}
