package mathPackage;
public class MyMathDemo {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println("Addition of 5.5 and 9.6 is: "+ math.addition(5.5, 9.6));        
        System.out.println("Substraction of 15.5 and 59.6 is: "+ math.substract(15.5, 59.6));
        System.out.println("Multiplication of 5.5 and 9.6 is: "+ math.multiply(5.5, 9.6));
        System.out.println("Division of 50 and 96 is: "+ math.division(50, 96));
        System.out.println("Factorial of 15 is: "+math.factorial(15));
    }    
}
