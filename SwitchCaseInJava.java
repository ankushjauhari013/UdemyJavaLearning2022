import java.util.Scanner;

class SwitchCaseInJava{
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter a character: ");

            char character = sc.next().charAt(0);
            switch (character) {
                case 'A':
                case 'a':
                    System.out.println("You have typed letter A! ");
                    break;
                case 'B':
                    System.out.println("You have typed letter B!");
                default:
                System.out.println("Its not A OR B! ");
                    break;
            }
            System.out.println("Program is closed! ");
            }



        }
}