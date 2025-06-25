class Animal{
    //when subclass object is called, at first
    //non parameterized consructor of parent is called
    public Animal(){
        System.out.println("Animal Constructor");
    }
    public Animal(int age){
        System.out.println("Animal constructor "+age);
    }
    public void eat(){
        System.out.println("Animal Eats");
    }
    public void walk(){
        System.out.println("Animal might walk");
    }
}
class Human extends Animal{
    public Human(){
        //to call parent class constructor
        super();
        System.out.println("Human Constructor");
    }
    //child class or subclass
    public void walk(){
        //super keyword is used to call parent class
        super.walk();
        System.out.println("Human Walks");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Human human1= new Human();
        human1.eat();
        human1.walk();
        

    }
    
}

