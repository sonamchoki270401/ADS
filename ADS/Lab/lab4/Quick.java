class Quick
{ 
    int partition(int array[], int lo, int hi) 
    { 
        int pivot = array[hi];  
        int i = (lo-1); // index of smaller element 
        for (int j=lo; j<hi; j++) 
        { 
            // If current element is smaller than the pivot 
            if (array[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = array[i]; 
                array[i] = array[j]; 
                array[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = array[i+1]; 
        array[i+1] = array[hi]; 
        array[hi] = temp; 
  
        return i+1; 
    } 
  
    void sort(int array[], int lo, int hi) 
    { 
        if (lo < hi) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(array, lo, hi); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(array, lo, pi-1); 
            sort(array, pi+1, hi); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int array[] = {17, 1, 8, 3, 4, 20}; 
        int n = array.length; 
  
        Quick ob = new Quick(); 
        ob.sort(array, 0, n-1); 
  
        System.out.println("The sorted element in array are:"); 
        printArray(array); 
    } 
} 