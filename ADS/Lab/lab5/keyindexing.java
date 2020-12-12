public class keyindexing{
	public void key(int array[]){
		int R = 256;//total different element in array 
		int N = array.length;//N for total length of element in array
		int[] aux = new int[N];
		int[] count = new int[R+1];
		//compute frequency counts
		for(int i =0; i < N; i++){

			count[array[i]+ 1]++;
		}
		// Transform counts to indices
		for(int r = 0; r < R; r++){

			count[r+1]+= count[r];
		}
		//Distributes the records
		for(int i = 0; i < N; i++){

			aux[count[array[i]]++] = array[i];
		}
		//copy back
		for (int i = 0; i < N; i++){
			array[i] = aux[i];

		}
		System.out.println("Array after sorting is:");
		for(int i = 0; i<array.length;i++){
			
			System.out.print("  "+array[i]);
		}
		System.out.println();
	}
	// main method
	public static void main(String [] args){
		keyindexing sc = new keyindexing();//creating object
		int array[] ={1,3,1,2,1,0,4,5};
		sc.key(array);//call function


	}
}