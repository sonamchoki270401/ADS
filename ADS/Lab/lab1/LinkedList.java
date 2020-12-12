public class LinkedList{
	//initialize the variable
	Node head;
	Node tail;
	int size;

	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}
	//This is used to find the first element  from list
	public int first(){
		return head.getElement();
	}
	//This function is used to find the last element from list
	public int last(){
		return tail.getElement();
	}
	// This function is used to add the new element in list from first
	public void addFirst(int n){
		Node newest = new Node(n, null);

		if(size == 0){
			head = newest;
			tail = newest;
		}
		else{
			newest.setNext(head);
			head = newest;
		}
		size = size + 1;

	}
	// This is used to add the new element in list from end
	public void addLast(int n){
		Node newest = new Node(n, null);
		if(size == 0){
			head = newest;
			tail = newest;
		}
		else{
			tail.setNext(newest);
			tail = newest;
		}
		size += 1;
	}
	// This function is used to remove the element from first list
	public int removeFirst(){
		int deletedElement = head.getElement();
		if(size == 0){
			return 0;
		}
		else{
			head = head.getNext();
			size = size - 1;
		}
		return deletedElement;
	}

}
//
class Node{
	private int element;
	private Node next;
	// constructor
	public Node(int element, Node next){
		this.element = element;
		this.next = next;
	}
	//getelement
	public int getElement(){
		return element;
	}
	// getNext
	public Node getNext(){
		return next;
	}
	//setElement
	public void setElement(int n){
		element = n;
	}
	//setNext
	public void setNext(Node n){
		next = n;
	}

}