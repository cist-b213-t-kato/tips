package binarytree.el;

public class BinaryTreeApp {
	public static void main(String[] args) {
		BinaryTreeNode rootNode = new BinaryTreeNode(10);
		
		rootNode.add(new BinaryTreeNode(18));
		rootNode.add(new BinaryTreeNode(8));
		rootNode.add(new BinaryTreeNode(6));
		rootNode.add(new BinaryTreeNode(15));
		rootNode.add(new BinaryTreeNode(3));
		rootNode.add(new BinaryTreeNode(20));
		
		rootNode.display();
		
	}
}
