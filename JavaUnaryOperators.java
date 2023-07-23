public class JavaUnaryOperators {
    public static void main(String[] args) {
        
        int var1, var2;
        var1 = 50;
        var2 = -var1;
        System.out.println("var1 is "+ " "+ var1 + " " +"var2 is "+ var2);

        var1=50;
        var2= var1++; //post-incrementing, store previous value, then increase by 1.
        System.out.println("var1 is "+ " "+ var1 + " " +"var2 is "+ var2);

        
        var1=50;
        var2= ++var1; //pre-incremening, increase var1 by 1, then assign to var2.
        System.out.println("var1 is "+ " "+ var1 + " " +"var2 is "+ var2);
    
        var1=50;
        var2= var1--; //post-decrementing, decrease var1 by 1, then assign to var2.
        System.out.println("var1 is "+ " "+ var1 + " " +"var2 is "+ var2);

        var1=50;
        var2= ++var1; //pre-decrementing, increase var1 by 1, then assign to var2.
        System.out.println("var1 is "+ " "+ var1 + " " +"var2 is "+ var2);

        boolean b1,b2;
        b1=true;
        System.out.println(b1);
        b2=!b1;
        System.out.println(b2);

    }
}
