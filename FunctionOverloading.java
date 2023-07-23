public class FunctionOverloading {

    public static void area(float side){  // function to get area of square
        System.out.println("Area of Square is: "+(side*side));
    } 
   public static void area(double radius){   // function to get area of circle
        System.out.println("Area of Circle is: "+ (3.1415*radius));
    } 
   public static void area(int l, int b){   // function to get area of rectangle
        System.out.println("Area of rectangle is: "+(l*b));
    } 

    public static void main(String[] args) {
        area(4,5);    //overloaded area method to find area of rectangle
        area(5F);    //overloaded area method to find area of square
        area(6d);  //overloaded area method to find area of circle 
    }
}
