package linkedlist;

public class DoublyLinkedList2 {
	
	public static void main(String[] args) {
		DoublyLinkedList2 list = new DoublyLinkedList2();

		list.insert(200);
		list.insert(200);
		list.insert(100);
		list.insert(300);
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
		
		DoublyLink itr = first;
		
		while(newLink.getData() > itr.getData()){
			if(itr.getNext() == null){
				connect(itr, newLink);
				return;
			}
			itr = itr.getNext();
		}
		
		if(itr.getPrev()!=null){
			connect(itr.getPrev(), newLink);
		}else{
			first = newLink;
		}
		connect(newLink, itr);
		
	}
	
	private void connect(DoublyLink p, DoublyLink n){
		p.setNext(n);
		n.setPrev(p);
	}
	
	public void display(){
		System.out.println("List Status: ");
		
		for(DoublyLink itr = first; itr!=null; itr = itr.getNext()){
			System.out.println(itr.getData());			
		}
		System.out.println("End");
		
	}
}
