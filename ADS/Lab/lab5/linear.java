public class linear{
	public void Search(int array[]){
		int N = array.length;// N for total number of element in array
		int search = 7;// 7 is our target value
		for(int i = 0; i < N; i++){
			//disply or print the target value from array
			if(array[i]==search){
				System.out.println("The search value"  + search +  "is in index: "+i);
				return ;
			}
			//This will print until target value find.
			else{
				System.out.println("The target value is not found in the array");
			}
		}
	}
	//method method
	public static void main(String [] args){
		linear sc = new linear();//creating an objects
		int array[] = {1,4,2,7,4,9};// inserting the element in array
		sc.Search(array);//calling function

	}
}