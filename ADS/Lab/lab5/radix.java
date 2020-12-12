public class radix{
	public static void sort(String[] array, int w){
		//sort array[] on leading W characters
		int N = array.length;
		int R = 256;
		String[] aux = new String[N];
		for(int d = w-1; d>=0; d--){
			//sort by key-indexed counting on dth char
			int [] count = new int[R+1];
			// compute frequeny counts
			for(int i=0; i <N; i++){
				count [array[i].charAt(d) + 1]++;
			}
			//Transform counts to indices
			for (int r=0; r<R; r++){
				count[r+1] += count[r];
			}
			//Distributes
			for (int i = 0; i < N; i++){
				aux[count[array[i].charAt(d)]++]=array[i];
			}
			//cype back
			for (int i = 0; i < N; i++){
				array[i] = aux[i];
			}
			
		}
		System.out.println("Array after sorting is:");
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i]+" ");
		}
		
	}
	//method method
	public static void main(String[] args) {
		radix sc=new radix();//creating object
		String array[] = {"Sonam","Karma","Choki"};//inserting element in array
		sc.sort(array,5);//calling function
		
	}
}