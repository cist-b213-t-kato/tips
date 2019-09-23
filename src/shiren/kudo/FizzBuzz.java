/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.kudo;
/**
 * 1～30までの数で、3で割り切れるとき「Fizz」、 5で割り切れるとき「Buzz」、 両方で割り切れるときは「FizzBuzz」と表示するクラス。
 */
public class FizzBuzz extends Keisyou {

    @Override
    public void execute() {
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%2d : ", i);
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.println();
        }
    }
}
