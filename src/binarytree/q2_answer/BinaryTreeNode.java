package binarytree.q2_answer;

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
		BinaryTreeNode itr = this;
		while(true){
			if(node.getData() <= itr.getData()){
				if(itr.getLeft()!=null){
					itr = itr.getLeft();
				}else{
					itr.setLeft(node);
					return;
				}
			}else{
				if(itr.getRight()!=null){
					itr = itr.getRight();
				}else{
					itr.setRight(node);
					return;
				}
			}
		}
		
	}
	
}
