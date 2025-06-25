public class Add1 {
    public static int add (int a, int b){
        int sum =a+b;
        return sum;
    }
    public static void mul(int a, int b){
        
        System.out.println(a*b);

    }
    public static void Greet() {
        System.out.println("Hello!, world");
        
    }
    public void Greetings(){
        System.out.println("Namaste");
    }
    public static void main(String[] args) {
        int Sum=add (1,5);
        System.out.println(Sum);
        mul(20,5);
        Greet();

        
        Add1 test= new Add1();
        test.Greetings();
    }
    
    
}
