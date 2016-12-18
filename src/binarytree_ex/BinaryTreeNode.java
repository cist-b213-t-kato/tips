package binarytree_ex;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeNode <T> {
    private T value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(){}
    
    public BinaryTreeNode(T v){
        setValue(v);
    }
    
    public List<BinaryTreeNode> getList(){
        return getList(new ArrayList<BinaryTreeNode>());
    }
    
    public List<BinaryTreeNode> getList(List<BinaryTreeNode> list){
        if(getLeft()!=null){
            list = this.getLeft().getList(list);
        }
        if(getRight()!=null){
            list = this.getRight().getList(list);
        }
        list.add(this);
        
        return list;
    }
    
    public T getValue() {
        return value;
    }

    public void setValue(T v) {
        this.value = v;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    
    
    
}
