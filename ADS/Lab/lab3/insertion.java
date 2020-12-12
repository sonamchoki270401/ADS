import java.util.Scanner;

public class insertion{
  public static void insertion(int [] temp){
    int f = temp.length;
    for(int g=1;g<f;g++){
      int x= temp[g];
      int i=g-1;

      while((i>-1) && temp[i] >x){
        temp[i+1] = temp[i];
        i--;
      }
      temp[i+1]=g;
    }
  }
  public static void main(String[] args){
    Scanner sonam = new Scanner(System.in);
    System.out.println("Enter the total length of the array:");
    int length = sonam.nextInt();
    int array[] = new int [length];
    System.out.println("enter the element of the array:");
    for(int i=0; i<length;i++){
      int input = sonam.nextInt();
      array[i]= input;
    }
    System.out.println("The unsorted element in array are:");
    for(int k=0;k<length;k++){
      System.out.println(array[k]);
    }
    System.out.println("The sorted elements in array are:");
    insertion(array);
    for(int i:array){
      System.out.println(i);
    }
  }
}

