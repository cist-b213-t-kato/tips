package binarytree.primitiveloop;

public class BinaryTree {
	
	final BinaryTreeNode rootNode;
	
	public BinaryTree(BinaryTreeNode rootNode){
		this.rootNode = rootNode;
	}

	public void append(BinaryTreeNode node){
		BinaryTreeNode itr = rootNode;
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
	
	public void display(){
		rootNode.display();
	}
	
	
}
