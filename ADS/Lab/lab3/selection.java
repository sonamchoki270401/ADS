import java.util.Scanner;
public class selection{
	/*main method*/
	public static void main(String [] args){

	//User input
	Scanner choki = new Scanner(System.in);
	// Total length of array that user want to insert
	System.out.println("Enter the total length of the array:");
	int size = choki.nextInt();
	int array [] = new int[size];
	// display the element in array before sorting
	System.out.println("Enter the array befor sorting :");
	for(int x=0;x<size;x++){
		int y = choki.nextInt();
		array [x] = y;
	}
	//performing selection sorting
	for(int x=0;x<size;x++){
		for(int y=x+1; y<size; y++){
			if(array[x]>array[y])
			{
				int temp = array[x];
				array[x] = array[y];
				array[y] = temp;
			}
		}
	}
	// display the element in array after sorting
	System.out.print("The array after sorting is:");
	for(int x=0;x<size;x++){
		System.out.print(array[x]+ " ");
	}
}
}

	