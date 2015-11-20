package binarytree;

public class BinaryTreeDataBean {
  private int intData;
  private Integer left = -1;
  private Integer right = -1;
  
  public BinaryTreeDataBean(int d, int l, int r){
    intData = d;
    left = l;
    right = r;
  }
  
  public BinaryTreeDataBean(int d){
    intData = d;
  }

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }
  
  
  
}
