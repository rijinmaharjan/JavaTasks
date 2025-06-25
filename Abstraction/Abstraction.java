//process of hiding impelemtation details and
// showing only the working feature
//1. Abstract Class 0% to 100% abstraction
//2. Interface : 100% abstraction
abstract class MyLaptop{
    //cannot instantiate abstract class -- not objects
    public MyLaptop(){}
    public MyLaptop(int num){
        System.out.println("Laptop Class"+ num);
    }
    void greet(){
        System.out.println("Hello");
    }
    // use abstract keyword to create abstract class
    // and abstract methods in them
    abstract void printName(); //abstract -- no method body 
}
class Asus extends MyLaptop{
// you can only extend one class
    public Asus(){
        System.out.println("Asus Class");
    }
    public Asus (int num){
        super(num);
    }
    @Override
    void printName() {
        throw new UnsupportedOperationException("I am Asus");
    }

    
}

interface Furniture{
    //ONLY CONTAINS METHODS THAT ARA ABSTRACT 
    //ONLY CONTAINS CONSTANT ATTRIBUTES
    //CANNOT HAVE CONSTRUCTOR
    void printLength();

}
interface Furniture2 extends Furniture{
    void printHeight();
}

class Table implements Furniture2{

    @Override
    public void printLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printLength'");
    }

    @Override
    public void printHeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printHeight'");
    }

}

public class Abstraction{

public static void main(String[] args) {
    //MyLaptop laptop = new MyLaptop();-- error
    Asus myAsus = new Asus();
    myAsus.greet();
    myAsus.printName();
}

}