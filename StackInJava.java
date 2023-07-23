import java.util.Stack;
import java.util.Scanner;
public class StackInJava {  
/* -Stack class is a subclass of the Vector class and represents a last-in-first-out (LIFO) stack of objects. 
It extends the Vector class to allow for easy implementation of the stack data structure. */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> Mystack = new Stack<Integer>();
            Mystack.push(10);
            Mystack.push(20);
            Mystack.push(30);
            Mystack.push(40);
            Mystack.push(50);
   
            System.out.println("My stack is: "+ Mystack);
            System.out.println("Top Element in the stack is: " + Mystack.peek()); // show peek, doesn't delete
            
           // while(!Mystack.isEmpty()){  // pop the item until stack is empty
            //System.out.println(" Popped item is: " + Mystack.pop());}
            
            //System.out.println("My stack is: "+ Mystack);


            Stack<Integer> Mystack2 = new Stack<Integer>();
            for(int i: Mystack){ //    // Pushing element on the top of the stack
                Mystack2.push(i); }

            System.out.println("My stack is: "+ Mystack2);

            System.out.println("Enter an integer to search in a stack: ");
            int num = sc.nextInt();

            int pos = Mystack2.search(num); // returns the position of the element from the top of the stack. Else, it returns -1.

           // if (!Mystack2.contains(num)){  //Returns true if this vector contains the specified element.
                //System.out.print("\nElement not found");}
            if(pos == -1){
                System.out.print("\nElement not found");} 
            else{
                System.out.println("Element is found at position: "+ pos);
            }
            Mystack2.add (1,60);
            System.out.println(Mystack2);
        }
}
}
