//ArrayList provides us with dynamic arrays in Java.
import java.util.*;

public class ArrayListJava {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){
            
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        // Declaring the ArrayList with initial size n
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        // Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            arr2.add(i); }
        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Operations performed in ArrayList

            //add(int index, Object):    
            ArrayList<String> a1 = new ArrayList<String>();
            a1.add("Ankush");
            a1.add("is a good boy");
            a1.add(1,"Jauhari");
            System.out.println("Array is:" + a1);

            //change the element,using the set() method
            ArrayList<String> a2 = new ArrayList<String>();
            a2.add("Ankuh");
            a2.add("23");
            a2.add(1,"Ankush");
            System.out.println("Initial ArrayList " + a2);

            a2.set(1, "Jauhari");
            System.out.println("Updated ArrayList " + a2);
        
            // Removing element from above ArrayList
            // al.remove(1);
        
        // Removing this word element in ArrayList 
        //al.remove("Jauhari"); 


        // Iterating the ArrayList
        //using the basic for loop in combination with a get() method

        for (int i=0;i<a1.size();i++){
            System.out.println(a1.get(i)+ " ");
        }
                System.out.println();

                for(String s:a1){
                    System.out.print(s+" ");
                }
        System.out.println();
        
        // ArrayList Sort
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println("Before sorting list:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sorting list:");
        System.out.println(list);
        System.out.println("Displaying  the content of list: "+list);
    
        // list1=[1,2,3,4,5]     list2 = [6,7,8,9]
        // Getting element at index 2
        // int element = list1.get(2);   
        // output:3
    
        // inserting all elements, list2 will get printed after list1
        // list1.addAll(list2); 
        // output: 1,2,3,4,5,6,7,8,9

        // inserting all elements of list2 at third position
        // list1.addAll(2, list2);    
        // output: 1,2,6,7,8,9,3,4,5

        // Clearing off elements using clear() method
        //list1.clear();
        //output: []
 
        // use contains() to check if the element 5 exits or not can also check for string
        // ans = list1.contains(5);   if (ans) System.out.println("The list contains 5");
        // output: The list contains 5




    }    
    }
}
