class StaticDemo {
    
    static int staticVar;
    int var;
    public StaticDemo() {
        var=0; // initialize non-static variable to 0
    }

    public static void SetStaticVar(int x){ //  static method can only access static variables 
        staticVar = x;
        // var = 100; Error
    }
    public void increase(){  // but non static method can acces static and non static variables both.
        staticVar++; // increarse the value of static variable
        var++; // increase the value of non static variable
    }
    public void display(){
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Non Static Variable is: "+ var);
        System.out.println();
    }
}
