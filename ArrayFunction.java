import java.util.Arrays;
import java.util.Scanner;
public class ArrayFunction {
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in))
    {
        System.out.println("Enter the size of the Array");
        int size = 0;
        if(sc.hasNextInt()){
            size = sc.nextInt();
        }

        int intArry[] = new int[size];
        System.out.println("Enter " + size + " Elements: ");
        for(int i =0; i<size;i++){
          intArry[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array is: ");
        for(int x: intArry){
            System.out.print(x +" ");
        }System.out.println();

        // To convert the elements as List
        System.out.println("Integer Array as List: "+ Arrays.asList(intArry));
        System.out.println();

        //binarySearch()This methods search for the specified element in the array with the help of the binary search algorithm.
        System.out.println("Enter the key you want to search in an array: ");
        int key = sc.nextInt();
        System.out.println(key + " founded at index = " + Arrays.binarySearch(intArry,key));

        //binarySearch(array, fromIndex, toIndex, key, Comparator) 
        Arrays.sort(intArry);
        System.out.println( key + " found at index = " + Arrays.binarySearch(intArry, 1, 3, key));
        
        //compare(array 1, array 2) Method 
        int intArry2[] = {58,41,2,6,9};
        System.out.println("Integer Arrays on comparison: "+ Arrays.compare(intArry, intArry2));  
    
        //equals(array1, array2) Method 
        System.out.println("Integer Arrays on comparison with .equals: "+ Arrays.equals(intArry, intArry2));
        
        //fill(originalArray, fillValue) Method
        int fillarry[] = new int[5];
        Arrays.fill(fillarry,key);
        System.out.println("Integer Array on filling: "+ Arrays.toString(fillarry));
        //System.out.println("Integer Array on filling: "+ fillarry);

        //copyOf(originalArray, newLength) Method 
        System.out.println("\nNew Arrays by copyOf:\n");
        System.out.println("Integer Array: "+ Arrays.toString(Arrays.copyOf(intArry, 10)));    

        //sort(originalArray) Method 
        Arrays.sort(intArry2);
        System.out.println("Integer Array After normal sort: " + Arrays.toString(intArry2));

        //sort(originalArray, fromIndex, endIndex) Method 
        Arrays.sort(intArry2, 1, 3);
        System.out.println("Integer Array after fromIndex, endIndex sort: "+ Arrays.toString(intArry2));

        /*parallelSort(originalArray) Method 
        Time Complexity is O(nlogn)
        parallelSort() method uses concept of MultiThreading which makes the sorting faster as compared to normal sorting method.*/
        Arrays.parallelSort(intArry);
        System.out.println("Integer Array After Parallel Sort: "+ Arrays.toString(intArry));
       
        //mismatch(array1, array2) Method
        System.out.println("The element mismatched at index: " + Arrays.mismatch(intArry, intArry2));

        //copyOfRange(originalArray, fromIndex, endIndex) Method 
        System.out.println("\nNew Arrays by copyOfRange:\n");
  
        // To copy the array into an array of new length
        System.out.println("Integer Array: "+ Arrays.toString(
            Arrays.copyOfRange(intArry2, 1, 3)));

    }
}
}

