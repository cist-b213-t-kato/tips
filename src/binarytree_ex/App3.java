/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree_ex;

import java.util.ArrayList;

class PTree extends BinaryTreeNode<String> {
    
    public void transform(){
        ArrayList<String> strlist = new ArrayList<String>();
        strlist.add("A");
        strlist.add("+");
        strlist.add("B");
        strlist.add("*");
        strlist.add("C");
        strlist.add("-");
        strlist.add("D");
        ArrayList<String> strlist2 = new ArrayList<String>();
        
        for(String s : strlist){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}

public class App3 {
    public static void main(String[] args){
        
        PTree tree = new PTree();
        
        tree.transform();
            
//        System.out.println(tree.getValue());
        
    }
    
    
}
