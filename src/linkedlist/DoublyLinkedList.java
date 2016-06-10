package linkedlist;

public class DoublyLinkedList {
	
	/**
	 * テスト用
	 * @param args
	 */
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();

		list.insert(200);
		list.insert(100);
		list.insert(300);
		
		list.display();
		
	}

	private DoublyLink first = null;

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
	
	public void display(){
		System.out.println("List Status: ");
		
		for(DoublyLink itr = first; itr!=null; itr = itr.getNext()){
			System.out.println(itr.getData());			
		}
		System.out.println("End");
		
	}
}
