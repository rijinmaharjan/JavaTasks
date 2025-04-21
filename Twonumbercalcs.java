import java.util.Scanner;

public class Twonumbercalcs {
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter first number:");
        int first= op.nextInt();
        System.out.print("Enter second number: ");
        int second= op.nextInt();
        System.out.println("The sum of two numbers are:"+(first+second));
        System.out.println("The difference of two numbers are:"+(first-second));
        System.out.println("The product of two numbers are:"+(first*second));
        System.out.println("The quotient of two numbers are:"+(first%second));
    }
}
