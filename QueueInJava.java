import java.util.*;
import java.util.stream.Stream;

public class QueueInJava {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
         Queue<Integer> myQueue = new LinkedList<>();
         for (int i=0;i<5;i++){
            myQueue.add(i);}
        
        System.out.println("My Queue is: "+ myQueue);
        System.out.println("Top Element in the stack is: " + myQueue.peek());

        Queue<String> fruits = new LinkedList<>();
        // add elements to the queue
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        System.out.println("Queue is: "+ fruits);

         // remove the element at the front of the queue
         String front = fruits.remove();
         System.out.println("Removed element: " + front);
         System.out.println("Queue after removal: " + fruits);
         
        fruits.add("Pineapple");
        String peeked = fruits.peek();
        System.out.println("Peeked element: " + peeked);
 
        // print the updated queue
        System.out.println("Queue after peek: " + fruits);

        int sizeOfFruits = fruits.size();
        System.out.println("Size of queue is: "+ sizeOfFruits);
    
        // display the queue’s contents, the simplest way is to call the toString() method
        Stream.of(fruits.toString()).forEach(System.out::println);
    }
    }
}
