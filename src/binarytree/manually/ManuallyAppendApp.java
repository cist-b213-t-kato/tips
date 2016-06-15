package binarytree.manually;

public class ManuallyAppendApp {
	public static void main(String[] args) {
		BinaryTreeNode node = new BinaryTreeNode(10);
		
		node.setLeft(new BinaryTreeNode(6));
		node.setRight(new BinaryTreeNode(18));
		
		node.getLeft().setLeft(new BinaryTreeNode(3));
		node.getLeft().setRight(new BinaryTreeNode(8));

		node.getRight().setLeft(new BinaryTreeNode(15));
		node.getRight().setRight(new BinaryTreeNode(20));
		
		node.display();
		
	}
}
