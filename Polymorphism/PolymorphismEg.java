//polymorphism-- having many forms
//objects of differen class act like objects from same superclass
public class PolymorphismEg{

    //method overloading
    //Same name of tmethod byt different parameter
    //does not require inheritance
    
    public void add(int a, int b){
        System.out.println("Called with two parameters");
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println("Called with three parameters");
        System.out.println(a+b+c);
    }

}

//Method overiding-- run time polymorphism
class Parent{
    public void greet(){
        System.out.println("Parent greet");
    }
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Child greet");
    }
}
class Example{
    public static void main(String[] args) {
        PolymorphismEg poly= new PolymorphismEg();
        poly.add(1, 2);
        poly.add(1, 2, 3);

    }
}
