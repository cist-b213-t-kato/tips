package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryNode {
	private int data;
	private BinaryNode leftNode;
	private BinaryNode rightNode;
	
	public static void main(String[] args) {
		BinaryNode root = new BinaryNode(10);

		root.append(new BinaryNode(8));
		root.append(new BinaryNode(3));
		root.append(new BinaryNode(20));
		root.append(new BinaryNode(18));
		root.append(new BinaryNode(6));
		root.append(new BinaryNode(9));
		
		List<Integer> list = root.createSortedList();
		
		for(int n : list){
			System.out.print(n + " ");
		}
		
	}
	
	public BinaryNode(int data){
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setLeftNode(BinaryNode leftNode){
		this.leftNode = leftNode;
	}
	
	public void setRightNode(BinaryNode rightNode){
		this.rightNode = rightNode;
	}
	
	public BinaryNode getLeftNode(){
		return leftNode;
	}
	
	public BinaryNode getRightNode(){
		return rightNode;
	}
	
	public void append(BinaryNode node){
		if(node.getData()<this.data){
			if(leftNode==null){
				leftNode = node;
			}else{
				leftNode.append(node);
			}
		}else{
			if(rightNode==null){
				rightNode = node;
			}else{
				rightNode.append(node);
			}
		}
	}
	
	public List<Integer> createSortedList(){
		List<Integer> list = new ArrayList<>();
		return createSortedList(list);
	}
	
	protected List<Integer> createSortedList(List<Integer> list){
		if(leftNode!=null){
			leftNode.createSortedList(list);
		}
		list.add(data);
		if(rightNode!=null){
			rightNode.createSortedList(list);
		}
		return list;
	}
	
	public List<Integer> createList(){
		List<Integer> list = new ArrayList<>();
		return createList(list);
	}
	
	protected List<Integer> createList(List<Integer> list){
		list.add(data);
		if(leftNode!=null){
			leftNode.createSortedList(list);
		}
		if(rightNode!=null){
			rightNode.createSortedList(list);
		}
		return list;
	}
	
}
