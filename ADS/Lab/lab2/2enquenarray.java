public class enquenarray{
	int array[];
	int len;
	int max;
	int front;
	int rear;
	//constructor to assign values to the variables
	public enquenarray(){
		len = 0;
		max = 10;
		front =  0;
		rear = -1;
		array = new int[max];

	}
	public int len(){
		return len;
	}
	public boolean isEmpty(){
		if(len==0){
			return true;
		}
		return false;
	}
	public int front(){
		if(isEmpty()){
			return 0;
		}
		return array[front];
	}
	public void enquen(int e){
		if(len>max){
			System.out.println("enquenarray overflow");
		}
		else{
			array[rear+1]=e;
			rear = rear+1;
			System.out.println(e);
		}
		len = len+1;
	}
	public int dequen(){
		if(isEmpty()){
			return 0;
		}
		else{
			front = front+1;
		}
		len = len-1;
		return array[front -1];
	}
	public static void main(String [] args){
		enquenarray q = new enquenarray();// creating object of class stack
		q.enquen(2);
		q.enquen(3);
		q.enquen(4);
		q.enquen(5);
		System.out.println("dequen: " +q.dequen());
		System.out.println("size: " +q.len());
		System.out.println("isEmpty: " +q.isEmpty());
		System.out.println("first element: " +q.front());

		//checking whether all functions are working
    	assert(q.isEmpty() == false);
    	assert(q.size() == 3);
    	assert(q.front() == 3N);
    	assert(q.dequen() == 2);
    	System.out.println("All the functions are working");
		
	}
}
