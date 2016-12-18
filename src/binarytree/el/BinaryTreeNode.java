package binarytree.el;

public class BinaryTreeNode {
	protected int data;
	protected BinaryTreeNode left;
	protected BinaryTreeNode right;
	
	public BinaryTreeNode(int data){
		this.data = data;
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
	
	public void add(BinaryTreeNode newNode){
		if(newNode.data <= data){
			if(left!=null){
				left.add(newNode);
			}else{
				left = newNode;
			}
		}else{
			if(right!=null){
				right.add(newNode);
			}else{
				right = newNode;
			}
		}
	}
	
}
