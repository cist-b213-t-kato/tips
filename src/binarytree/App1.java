package binarytree;

public class App1 {
    public static void main(String[] args){
        Integer[] data = { 10, 6, 18, 3, 8, 15, 20, 1, 5, 12, 17, 11};
        
        BinaryTreeNode1 first = new BinaryTreeNode1(data[0]);
        
        for(int i=1; i<data.length; i++){
            first.searchAndAdd(new BinaryTreeNode1(data[i]));
        }
        
        first.searchAndAdd(new BinaryTreeNode1(20) );
        
    }
}
