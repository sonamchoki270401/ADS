public class stacktest{
	public static void main(String [] args){
		stacklinklist obj = new stacklinklist();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		System.out.println("IsEmpty: ="+obj.isEmpty());
		System.out.println("The size of element is: ="+obj.size());
		System.out.println("The top is: ="+obj.top());
		obj.pop();
		System.out.println("The size of element is: ="+obj.size());
		assert(obj.isEmpty() == false);
		assert(obj.size() == 4);
		
		System.out.println("All the Function are working");

	}
}