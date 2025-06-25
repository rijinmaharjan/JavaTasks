class Bird{
    public void fly(){
        System.out.println("It flies");
    }
    public void eat(){
        System.out.println("Eats well");
    }

}
class Ostrich extends Bird{

    public void fly(){
        System.out.println(" Ostrich Cannot fly");
    }
    public void printDetails(){

    }
    
}
class WhiteOstrich extends Ostrich{
    //bird, ostrich
    //hierarchial inheritance

}
class Eagle extends Bird{}
public class BirdInheritence {
    public static void main(String[] args) {
        Ostrich osh=new Ostrich();
        Eagle eag= new Eagle();
        osh.fly();
        osh.eat();
        eag.fly();
        eag.eat();
    }
    
}
