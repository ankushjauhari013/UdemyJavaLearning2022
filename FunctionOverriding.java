class Animal{
    public void movement(){
        System.out.println("Animals can move! ");
    }
}

class Dog extends Animal{
    @Override
    public void movement(){
        System.out.println("Dog can walk and run also!\n ");
    }
}
class Frog extends Animal{
    @Override
    public void movement(){

        System.out.println("Calling movement method from parent class! ");
        super.movement();
        System.out.println("Frog can jump! ");
    }
}
public class FunctionOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal(); //set animal as object as animal class
        animal.movement();

        //set animal reference variable to point Dog object
        animal=new Dog();
        animal.movement();

        //set animal reference variable to point Frog object
        animal=new Frog();
        animal.movement();
    }
   

}
