package binarytree;

public class BinaryTreeNode1<T> {
    private int data;
    private BinaryTreeNode1 left;
    private BinaryTreeNode1 right;

    public BinaryTreeNode1(int d){
        setData(d);
    }
    
    public BinaryTreeNode1 search(BinaryTreeNode1 b){
        if(b.getData() == this.data){
            return this;
        }else if(b.getData()<this.data && left!=null){
            return left.search(b);
        }else if(b.getData()>this.data && right!=null){
            return right.search(b);
        }
        
        return null;
    }
    
    public BinaryTreeNode1 searchAndAdd(BinaryTreeNode1 b){
        System.out.print(this.getData()+":");
        if(b.getData() == this.data){
            System.out.println("発見");
            return this;
        }else if(b.getData()<this.getData()){
            System.out.println("left <-");
            if(left==null){
                System.out.println(b.getData() +"を"+getData()+"の左下に追加します");
                this.setLeft(b);
                return this.getLeft();
            }
            return left.searchAndAdd(b);
        }else if(b.getData()>this.getData()){
            System.out.println("right ->");
            if(right==null){
                System.out.println(b.getData() +"を"+getData()+"の右下に追加します");
                this.setRight(b);
                return this.getRight();
            }
            return right.searchAndAdd(b);
        }
        
        return null;
    }
    
    public void insert(BinaryTreeNode1 b){
        if(b.getData() < data){
            if(left!=null){
                left.insert(b);
            }else if(left==null){
                left = b;
            }
        }else if(b.getData() > data){
            if(right!=null){
                right.insert(b);
            }else if(right==null){
                right = b;
            }
        }
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode1 getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode1 left) {
        this.left = left;
    }

    public BinaryTreeNode1 getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode1 right) {
        this.right = right;
    }
    
    
    
}
