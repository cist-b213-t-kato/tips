/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.anan;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MainApp {
    
    public static void main(String[] args){
        ArrayList<Execute> list = new ArrayList<>();
        list.add(new FizzBuzz());
        list.add(new Tree());
        list.add(new PrimeNumber());
        
        list.stream().forEach(o->o.execute());
    }
    
}
