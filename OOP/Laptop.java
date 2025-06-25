//accessModifier class ClassName{
//class body
//}
//private--personal diary
//public-- census data
//default-- group chat
//protected-- family house
public class Laptop{
    private String model;
    private String color;
    private double price;

    public Laptop (){
        //Non parameterized constructor
        System.out.println("Constructor for laptop class");
    }

    public Laptop (String model){
        //parameterized constructor
        System.out.println("Constructor");
    }
    public Laptop (String model, String color, double price){
        this.model=model;
        this.color=color;
        this.price=price;
    }
    //setter to set value to attribute
    public void setModel(String model){
        this.model=model;
    }
    //getter to return value of an attribute
    public String getModel(){
        return model;
    }
    //openApp closeApp turnOn turnOff
    // public void openApp(){}
    // public void closeApp(){}
    // public void turnOn(){}
    // public void turnOff(){}

}
class DriverClass{
    public static void main(String[] args) {
        Laptop acer=new Laptop();
        Laptop hp=new Laptop("HP");
        Laptop asus= new Laptop("Asus","black",2000);
        // acer.setModel("Acer Predator");
        // System.out.println(acer.getModel());
        //here
        //identity --name--acer predator
        //property-- attribute -- price,model,color
        //behavior --method --

        
        // acer.color="Black";
        // acer.model="Predator";
        // acer.price=202020;
        // acer.openApp();
        // acer.closeApp();
        // acer.turnOn();
        // acer.turnOff();

    }
}