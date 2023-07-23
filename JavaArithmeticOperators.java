import java.util.Scanner;
public class JavaArithmeticOperators {

    public static void main(String[] args) {
        int a,b,result;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            a=sc.nextInt();
            System.out.print("\nEnter the second number: ");
            b=sc.nextInt();
        }
        result = (a+b);
        System.out.println("Sum of "+a+" "+"and" + " "+ b + " " +"is " +result);

         //((addition)) a+b 
         //((substraction)) a-b
         //((divison)) a/b
         //((multiplication)) a*b
         // ((remainder)) a%b
        System.out.println(a);
        System.out.println(b);
    }
}
