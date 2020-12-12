public class binary{
	public int search(int []array, int target, int low, int high){
		if(high >= low){
			int mid = (low+high)/2;
			if(target== array[mid]){
				return mid;
			}
			else if (target < array[mid]){
				return search(array, target, low, mid-1);
			}
			else{
				return search(array, target, mid + 1, high);
			}
		}
		return -1;

	}
	public void sort(int []array){
		int N = array.length;
		System.out.println("The sorted element in array is: ");
		for(int i =0; i <= N-1; i++){
			int smallest = i;
			for(int j =i+1; j<N;j++){
				if(array[j]<array[smallest]){
					smallest = j;
				}
			}
			int aux = array[smallest];
			array[smallest] = array[i];
			array[i] = aux;
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String [] args){
		binary obj = new binary();
		int array[] = {2,3,1,9,8,0};
		obj.sort(array);
		int y = obj.search(array,9,3,5);
		if(y == -1){
			System.out.println("The element is not found in array:");

		}
		else{
			System.out.println("\nThe target value is in index: "+y);
		}



	}
}