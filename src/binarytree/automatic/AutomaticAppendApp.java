package binarytree.automatic;

public class AutomaticAppendApp {
	public static void main(String[] args) {
		BinaryTreeNode rootNode = new BinaryTreeNode(10);
		
		rootNode.append(new BinaryTreeNode(18));
		rootNode.append(new BinaryTreeNode(8));
		rootNode.append(new BinaryTreeNode(6));
		rootNode.append(new BinaryTreeNode(15));
		rootNode.append(new BinaryTreeNode(3));
		rootNode.append(new BinaryTreeNode(20));
		
		rootNode.display();
		
	}
}
