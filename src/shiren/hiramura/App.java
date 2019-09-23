package shiren.hiramura;
import java.util.ArrayList;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b2161490
 */
public class App {
    public static void main(String[] args){
        List<Execute> list=new ArrayList<>();
        list.add(new FizzBuzz());
        list.add(new Tree());
        list.add(new PrimeNumber());
        list.stream().forEach(o->o.execute());
    }
}
