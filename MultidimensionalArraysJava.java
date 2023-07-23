import java.util.Scanner;
public class MultidimensionalArraysJava{
public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
 
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
 
        int[][] multidimensionalArray= new int[rows][columns];
 
        // Now you can use the array like a regulal 2-dimensional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multidimensionalArray[i][j]= (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(multidimensionalArray[i][j]+ " ");
            }
 
            System.out.println();
        }

//Jagged Array in Java : Array with in an array
//Final Arrays in Java : data can be changed which means we can change the state of the object but not reference. 


        final int arr1[] = { 1, 2, 3, 4, 5 };
 
        // Declaring normal integer array
        int arr2[] = { 10, 20, 30, 40, 50 };
 
        // Assigning values to each other
        arr2 = arr1;
        //arr1 = arr2; Error Line
          
        /*So a final array means that the array variable which is actually a reference to an object,
        cannot be changed to refer to anything else, but the members of the array can be modified*/
 
        // Now iterating over normal integer array
        for (int i = 0; i < arr2.length; i++)
 
            // Printing the elements of above array
            System.out.println(arr2[i]);
       
        }
}
}