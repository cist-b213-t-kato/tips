package binarytree.primitiveloop;

public class PrimitiveAutomaticAppendApp {
	
	
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(new BinaryTreeNode(10));
		
		tree.append(new BinaryTreeNode(18));
		tree.append(new BinaryTreeNode(8));
		tree.append(new BinaryTreeNode(6));
		tree.append(new BinaryTreeNode(15));
		tree.append(new BinaryTreeNode(3));
		tree.append(new BinaryTreeNode(20));
		
		tree.display();
		
	}
	
	
}
