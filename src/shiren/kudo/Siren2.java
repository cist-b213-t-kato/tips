/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.kudo;

import java.util.ArrayList;
import java.util.List;



public class Siren2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Keisyou> list = new ArrayList<>();
        list.add(new FizzBuzz());
        list.add(new Tree());
        list.add(new Sosu());
        
        list.stream().forEach(o->o.execute());
        
    }
    
}
