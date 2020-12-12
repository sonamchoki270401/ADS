class Node{
	int element;
	Node next;

	public Node(int element){
		this.element = element;
		this.next = null;
	}
}
public class stacklinklist{
	Node head;
	int size;

	public void stacklinklist(){
		Node head = null;
		int size = 0;
	}
	public void push(int element){
		Node newest = new Node(element);
		newest.next = head;
		head = newest;
		System.out.println(element);
		size += 1;
	}
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		else{
			return false;
		}
	}
	public int size(){
		return size;
	}
	public int top(){
		if(head == null){
			System.out.println("A stack is empty");
		}
		return head.element;
	}
	public void pop(){
		Node temp = head;
		this.head = this.head.next;
		System.out.println("The pop element is ="+temp.element);
		size -= 1;
	}
}


