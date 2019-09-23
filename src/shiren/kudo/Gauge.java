/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.kudo;


/**
 *
 * @author mstk1
 */
public class Gauge {
    
    int value = 0;
    
        public int getValue(){
            return this.value;
        }
    
        public void setValue(int value) throws IllegalArgumentException{
            if (value < 0 || 999 < value) {
                throw new IllegalArgumentException("out of range");
            }else{
                this.value = value;
            }
        }

}
