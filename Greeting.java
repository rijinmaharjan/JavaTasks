import java.util.Scanner;
public class Greeting{
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=op.nextLine();
        System.out.println("Hello! "+name+", Good morning. I hope you have a nice day.");

    }
}