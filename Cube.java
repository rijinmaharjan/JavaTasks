import java.util.Scanner;
public class Cube {
    public static void cubernumber(){
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = op.nextInt();
        System.out.println("The cube of number "+ a + " is : "+(a*a*a));
    }
    public static void main(String[] args) {
        cubernumber();
    }
    
}
