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
public class Gauge {

    private int value;

    public Gauge() {
    }

    public Gauge(int value) {
        if (value >= 0 && value <= 999) {
            this.value = value;
        }
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 999) {
            this.value = value;
        }
    }

    public int getInt() {
        return value;
    }

}
