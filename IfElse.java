import java.util.Scanner;
public class IfElse {
    public static void main (String[] args)
    {
        Scanner OAge=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=OAge.nextInt();
        if (age>18){
            System.out.print("You are eligible to vote.");
        }
        else if(age<18){
            System.out.print("You are not elibible to vote.");
        }
        else{
            System.out.print("Invalid input");
        }
        OAge.close();
    }
}
