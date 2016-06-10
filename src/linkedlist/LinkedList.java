package linkedlist;

public class LinkedList {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insert(200);
		list.insert(200);
		list.insert(100);
		list.insert(300);
		list.insert(200);
		list.insert(100);
		list.insert(300);
		
		list.display();
		
	}
	
	private Link first = null;

	public void insert(int data) {
		Link newLink = new Link(data);
		Link before = null;
		
		for(Link itr=first; itr!=null; itr=itr.getNext()){
			if(itr.getData() > newLink.getData()){
				newLink.setNext(itr);
				break;
			}
			before = itr;
		}
		if(before!=null){
			before.setNext(newLink);
		}else{
			first = newLink;
		}
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void display(){
		System.out.println("List Status: ");
		
		for(Link itr = first; itr!=null; itr = itr.getNext()){
			System.out.println(itr.getData());			
		}
		System.out.println("End");
		
	}

}
