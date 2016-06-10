package linkedlist.hint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoublyLinkedList {
	
	/**
	 * テスト用のmainメソッド
	 * 実行結果が 100 200 300 のようになれば成功
	 */
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();

		list.insertLast(200);
		list.insertLast(200);
		list.insertLast(100);
		list.insertLast(300);
		list.insertLast(200);
		list.insertLast(100);
		list.insertLast(300);

		list.display();
		
		list.sort();
		list.display();
		
	}

	private DoublyLink first = null;
	private DoublyLink last = null;

	public void insert(int data) {
		DoublyLink newLink = new DoublyLink(data);

		if(first == null){
			first = newLink;
			return;
		}
		
		DoublyLink itr; 
		
		for(itr=first; newLink.getData()>itr.getData(); itr=itr.getNext()){
			if(itr.getNext() == null){
				itr.setNext(newLink);
				newLink.setPrev(itr);
				return;
			}
		}
		
		if(itr.getPrev()!=null){
			itr.getPrev().setNext(newLink);
			newLink.setPrev(itr);
		}else{
			first = newLink;
		}
		newLink.setNext(itr);
		itr.setPrev(newLink);
		
	}
	
	public void insertFirst(int data){
		DoublyLink link = new DoublyLink(data);
		if(first==null){
			last = link;
		}else{
			first.setPrev(link);
			link.setNext(first);
		}
		first = link;
	}
	
	public void insertLast(int data){
		DoublyLink link = new DoublyLink(data);
		if(last==null){
			first = link;
		}else{
			last.setNext(link);
			link.setPrev(last);
		}
		last = link;
	}
	
	/**
	 * ダサいソート
	 */
	public void sort(){
		List<DoublyLink> list = new ArrayList<>();
		
		for(DoublyLink itr=first; itr!=null; itr=itr.getNext()){
			list.add(itr);
		}
		
		Collections.sort(list, (o1,o2)->o1.getData()-o2.getData());
		
		for(int i=0; i<list.size()-1; i++){
			list.get(i).setNext(list.get(i+1));
			list.get(i+1).setPrev(list.get(i));
		}
		
		first = list.get(0);
		first.setPrev(null);
		last = list.get(list.size()-1);
		last.setNext(null);
		
	}
	
	public void display(){
		System.out.println("List Status: ");
		
		for(DoublyLink itr = first; itr!=null; itr = itr.getNext()){
			System.out.println(itr.getData());			
		}
		System.out.println("End");
		
	}
}
