import java.util.Scanner;
public class JavaString {
    public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in))
    {
        char[] charString ={'S','t','r','i','n','g'}; // an array of characters

        System.out.println(charString); //output:  String
       // System.out.println("Printing the array: " + charString); // printing the reference

        String str = new String(charString); // make string from the character array
        System.out.println("The value of str is: " + str);   //output:  String

        str = scanner.next();   // getting string from user
        System.out.println("The value of str is: " + str);        
    }    
    }
}
