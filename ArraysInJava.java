import java.util.Scanner;
public class ArraysInJava{
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int intArr[] = {1,2,3,4,5};
        char CharArr[] = new char[5];
        float[] fltArr =  new float[5];

        fltArr[0] = 1.1f;
        fltArr[1] = 2.2f;
        fltArr[2] = 3.3f;
        fltArr[3] = 4.4f;
        fltArr[4] = 5f;

        System.out.println("Enter 5 characters:");

        for(int i = 0; i<5; i++){
            System.out.println("Enter character at index " + i);
            CharArr[i] = sc.next().charAt(0);}
        System.out.println("Entered Array is ");
        for (int i=0;i<5;i++){
            System.out.print(CharArr[i] + " ");
        }   
        System.out.println();
        System.out.println("Integer Array is ");
        for (int i=0;i<5;i++){
            System.out.print(intArr[i] + " ");
        }  
        System.out.println();
        System.out.println("Floating Array is ");
        for (int i=0;i<5;i++){
            System.out.print(fltArr[i] + " ");
        }  

        System.out.println();
        System.out.println("Enter the size of the Array");
        int size=0;
        if(sc.hasNextInt()){
             size = sc.nextInt();
        }

        int newarr[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                newarr[i] = sc.nextInt();
            }
        }  
        System.out.println("Dynamic Array is ");
        for (int j=0;j<size;j++){
            System.out.print(newarr[j] + " ");
        }  
    } 
}
}