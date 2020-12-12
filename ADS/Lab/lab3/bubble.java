import java.util.Scanner;
public class bubble
{
    public static void main(String [] args)
    {
        //user input
        Scanner scan = new Scanner ( System.in);
        //total length of element in array
        System.out.println("Enter the size of the array :");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the element of array :");
        for (int i = 0; i< size; i++)
        {
            int input= scan.nextInt();
            array[i]=input;
        }
        System.out.println("The unsorted elements in array are :");
        for ( int k = 0; k<size; k++)
        {
            System.out.println(array[k]);
        }
         System.out.println("Array after bubblesort: \n");  
        bubblesort(array);
         for(int i:array)
        {
            System.out.print(\n i );
        }   
    }
public static void bubblesort(int arr[])
{
    int n = arr.length;  
    int temp = 0;  
    for(int i=0; i < n; i++){  
        for(int k=1; k < (n-i); k++){  
            if(arr[k-1] > arr[k])
            {
                //swaping the elements
                temp = arr[k-1];  
                arr[k-1] = arr[k];  
                arr[k] = temp;  
                 }  
             }   
    }
}

}


    
  
           