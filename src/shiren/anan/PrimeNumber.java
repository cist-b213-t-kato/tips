/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.anan;

/**
 *
 * @author user
 */
public class PrimeNumber implements Execute {

    @Override
    public void execute() {
        for (int i = 1; i <= 30; i++) {
            for (int j = 2; (j < i && i % j != 0) || j==i; j++) {
                if (j==i) {
                    System.out.println(i);
                }
            }
        }
    }

}
