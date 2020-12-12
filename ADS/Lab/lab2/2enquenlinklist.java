class Linkedlist {
	Node front;
	Node tail;
	int size;
	public Linkedlist() {
		front = null;
		tail = null;
		size = 0;
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	public void enqueue(int element) {
		Node newNode = new Node(element, null);
		if(size == 0) {
			front = newNode;
			tail = newNode;
			System.out.println("The enqueue data is = " +element);
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
			System.out.println("A enqueue data is= " +element);
		}
		size = size + 1;
	}
	public int dequeue() {
		int deletedelement = front.getElement();
		if(isEmpty()) {
			return 1;
		}
		else {
			front = front.getNext();
			size -= 1;
			System.out.println("The dequeued data is = " +deletedelement);
		}
		return deletedelement;
	}
	
	public int first() {
		int firstelement = front.getElement();
		if(size == 0) {
			System.out.println("StackUnderFlowError");
		}
		else {
			return firstelement;
		}
		return first();
	}
	public int len() {
		if(isEmpty()) {
			return 1;
		}
		return size;
	}
}
class Node{
	//Variable declaration
	private int element;
	private Node next;
	public Node(int element, Node next) {
		this.element = element;
		this.next = next;
	}
	//getElement
	public int getElement() {
		return element;
	}
	//getNext
	public Node getNext() {
		return next;
	}
	//setElement
	public void setElement(int e) {
		element = e;
	}
	//setNext
	public void setNext(Node e) {
		next = e;
	}
}
public class enquenlinklist{

	public static void main(String[] args) {
		Linkedlist sc = new Linkedlist();
		sc.enqueue(1);
		sc.enqueue(2);
		sc.enqueue(3);
		sc.enqueue(4);

		System.out.println("The deleted data is = "+sc.dequeue());
		System.out.println("The first data is = " +sc.first());
		System.out.println("" +sc.isEmpty());
		System.out.println("The  total length of a queue elements is : " + sc.len());

		
		assert(sc.isEmpty() == false);
		assert(sc.first() == 1);
		assert(sc.len() == 3);
		System.out.println("All the test are passed");
		
	}
}