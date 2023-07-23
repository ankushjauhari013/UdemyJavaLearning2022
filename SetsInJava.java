import java.util.HashSet;
import java.util.Set;

public class SetsInJava {
    public static void main(String[] args) {
        int[] list1 = {1,2,5,6,12}; // some duplicates data are present
        int[] list2 = {2,3,4,12,15};

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        // add items in two different sets
        for(int item:list1)
        set1.add(item); 
        for(int item:list2)
        set2.add(item); 

        // display sets
        System.out.println("The first set is: " + set1);
        System.out.println("The second set is: " + set2);

        // union of sets
        Set<Integer> union = new HashSet<Integer>(set1); //copy the set one
        union.addAll(set2);  // adding all elements from one to another
        System.out.println("Union Set: "+ union);

        // intersection
        Set<Integer> intersected=new HashSet<>(set1);
        intersected.retainAll(set2);// remove those items, those are not present in set2
        System.out.println("Intersection Set: "+ intersected);

        // intersection
        Set<Integer> difference=new HashSet<>(set1);
        difference.removeAll(set2);  // remove common elements from set2 
        System.out.println("Difference Set: "+ difference);


        Set<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        System.out.println("Set is " + hs);
        String check = "D";

        // Check if the above string exists in the SortedSet or not
        // using contains() method
        System.out.println("Contains " + check + " " + hs.contains(check));

        // using remove() method
        hs.remove("B");
        System.out.println(hs);

    }
}
