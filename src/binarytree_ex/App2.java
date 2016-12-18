package binarytree_ex;

import java.util.List;

public class App2 {
    public static void main(String args[]){
        BinaryTreeNode s = new BinaryTreeNode<String>("=");
        s.setLeft(new BinaryTreeNode<String>("Z"));
        s.setRight(new BinaryTreeNode<String>("*"));
        s.getRight().setLeft(new BinaryTreeNode<String>("+"));
        s.getRight().setRight(new BinaryTreeNode<String>("C"));
        s.getRight().getLeft().setLeft(new BinaryTreeNode<String>("A"));
        s.getRight().getLeft().setRight(new BinaryTreeNode<String>("B"));
        
        List<BinaryTreeNode> list = s.getList();
        
        list.forEach(e->System.out.print(e.getValue()+" "));
        
    }
    
}
