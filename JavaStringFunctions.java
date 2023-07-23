import java.util.Scanner;
public class JavaStringFunctions {
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
        
         String str1 = "HELLO", str2 = "Helleo";
         
        // length function   str1.length()
        System.out.println("The length of the string1 is: " + str1.length());

        // equal method to check both strings are same or not (Case Sensitive) 
        if(str1.equals(str2)){
            System.out.println(str1 + " & " + str2 + " are same");
        }
        else{
            System.out.println(str1 + " & " + str2 + " are not same");
        }
        // equal method to check both strings are same or not (Case Insensitive) 
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(str1 + " & " + str2 + " are same (Ignoring case)");
        }
        else{
         System.out.println(str1 + " & " + str2 + " are same (Ignoring case)");
        }

        // find the character at the given index
        System.out.println("The character at position index 2 is: " + str1.charAt(2));

        // Uppercase characters will have the ASCII code 32 lesser than the same small lowercase character.
        // compare the first string with second, it returns distance of first mismatched characters        
        System.out.println("Comparing " + str1 + " & " + str2 + " Distance: " + str1.compareTo(str2));
        
        // check whether the string is starts or ends with the given substring or not
        System.out.println("Starts with function: "+ str1.startsWith("HEL"));
        System.out.println("Ends with function: " + str2.endsWith("ush"));

        // find the location of first and last occurance of a substring
        System.out.println("Index function: "+ str1.indexOf("LL"));
        System.out.println("Last Index function: " +str2.lastIndexOf("e"));

        // get substring from a given String excluding endIndex
        System.out.println("Substring Function: " +str1.substring(2, 5));
    
        // replace a substring with new substring
        System.out.println("Replace Function: "+ str1.replace("LL", "ww"));
    
        // split the string by using (-) as delimiter
        str1 = "This-is-a-test-string";
        String[] splitAray = str1.split("-"); 
        System.out.println("The Splitted parts are: ");
        for (String s : splitAray){ // for each element of splitted string set
            System.out.println(s);
        }
    } 
    }
}
