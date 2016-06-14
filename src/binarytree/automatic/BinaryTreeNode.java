package binarytree.automatic;

public class BinaryTreeNode {
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(int data){
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
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
	
	public void display(){
		if(left!=null){
			left.display();
		}
		System.out.println(data);
		if(right!=null){
			right.display();
		}
	}
	
	public void append(BinaryTreeNode node){
		if(node.getData() <= data){
			if(left!=null){
				left.append(node);
			}else{
				left = node;
			}
		}else{
			if(right!=null){
				right.append(node);
			}else{
				right = node;
			}
		}
	}
	
}
