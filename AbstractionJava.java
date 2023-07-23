public class AbstractionJava extends AbstractionInJava {
    @Override //we are bound to override func12 method
    void myFunction12(){
        System.out.println("MyFunction12 is executing...");
    }
    public static void main(String[] args) {
        AbstractionJava ob1 = new AbstractionJava();
        ob1.myFunction11();
        ob1.myFunction12();

        AbstractionInJava ob2 = new AbstractionInJava()
        {
        //we are bound to override func12 method
        /* as AbstractionInJava class is abstract class so it's object can not be defined until 
        we implpement all the unimplemented abstract methods in the respective class AbstractionInJava
        class */
        @Override
        void myFunction12(){
        System.out.println("MyFunction12 is executing here...");
    }
        };
        ob2.myFunction11();
        ob2.myFunction12();

    }

    
}

