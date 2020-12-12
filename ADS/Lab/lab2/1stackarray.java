public class stackarray{
	int array[];
	int top;
	int size;
	int max;
	//constructor to assign values to the variables
	public stackarray(){
		top = 0;
		size = 0;
		max = 8;
		array = new int[max];
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
	public int top(){
		if(isEmpty()){
			return 0;
		}
		return array[top];
	}
	public void push(int e){
		if(top>max){
			System.out.println("stackover");
		}
		else{
			array[++top] = e;
			System.out.println("push:" +e);
		}
		size = size +1;
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("stackover");
		}
		else{
			top = top - 1;
			size = size - 1;
		}
		return array[top+1];
	}
	public static void main(String [] args){
		stackarray obj = new stackarray(); // creating object of class stack
		obj.push(3);
		obj.push(2);
		obj.push(4);
		obj.push(6);
		System.out.println("pop value is: " +obj.pop());
		System.out.println("size of element is: " +obj.size());
		System.out.println("isEmpty:" +obj.isEmpty());
		System.out.println("top value is: " +obj.top());

		//checking whether all functions are working
    	assert(obj.isEmpty() == false);
    	assert(obj.size() == 3);
    	assert(obj.top() == 4);
    	assert(obj.pop() == 6);
    	System.out.println("All the functions are working");
	}
}