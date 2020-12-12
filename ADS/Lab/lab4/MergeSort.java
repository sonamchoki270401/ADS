import java.util.*;

public class MergeSort
{
  //main method
  public static void main(String args[])
  {
    //declared the variable
    int i, n;
    //user input
    Scanner obj = new Scanner(System.in);
    //total size or length of array
    System.out.print("Enter the length of the array:  ");
    n = obj.nextInt();
    int a[] = new int[n];
      // list of element and unsorted element in array
    System.out.print("Enter elements of the array:\n");
    for(i=0; i<n; i++)
      a[i] = obj.nextInt();


    MyMergeSort.sort_unorthodox(a);
    System.out.print("\nSorted array: ");//Display the sorted element in array
    System.out.println(Arrays.toString(a));
  }
} 

class MyMergeSort
{
  public static void sort_unorthodox(int a[])
  {
    int sorted_a[] = divide(a);
    for(int i = 0; i < a.length; i++) // copying the sorted array into the original array
      a[i] = sorted_a[i];
  }

  static int[] divide(int a[])
  {
    if(a.length <= 1) // one element array, nothing to sort
      return a;

    int i, left_size = a.length/2, right_size;
    if(a.length % 2 == 0)
      right_size = left_size;
    else
      right_size = left_size + 1;
    int left_half[] = new int[left_size];
    int right_half[] = new int[right_size];

    for(i=0; i<left_size; i++)
      left_half[i] = a[i];
    for(i=0; i<right_size; i++)
      right_half[i] = a[left_size+i];

    left_half = divide(left_half);
    right_half = divide(right_half);
    return merge(left_half, right_half);
  }

  static int[ ] merge(int a[ ], int b[ ])
  {
    int i=0, j=0, y=0, x = a.length, n = b.length;
    int d[ ];
    d = new int[x+n];

    while(i<x && j<n)
    {
      if(a[i] < b[j])
        d[y++] = a[i++];
      else
        d[y++] = b[j++];
    }
    while(i<x)
      d[y++] = a[i++];
    while(j<n)  
      d[y++] = b[j++];
    return d;
  }
} 
  
  