package binarytree.dic;

public class BTNApp {
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode("ドクツルタケ");
		
		root.add("クサウラベニタケ ");
		root.add("ツキヨタケ");
		root.add("カエンタケ");
		
		root.display();
		
	}
}
