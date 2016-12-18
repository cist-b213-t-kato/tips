package binarytree.dic;

public class BinaryTreeNode {
	private String data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(String data){
		this.data = data;
	}
	
	public void add(BinaryTreeNode newNode){
		if(newNode.data.compareTo(data)<0){
			if(left==null){
				left = newNode;
			}else{
				left.add(newNode);
			}
		}else{
			if(right==null){
				right = newNode;
			}else{
				right.add(newNode);
			}
		}
	}
	
	public void add(String str){
		add(new BinaryTreeNode(str));
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
	
}
