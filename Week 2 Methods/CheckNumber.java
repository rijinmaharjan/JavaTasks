import java.util.Scanner;

public class CheckNumber {
    public static void Checker(int first){
        
        if (first>0){
            System.out.println("The number "+first+" is Positive.");
        }
        else if (first<0){
            System.out.println("The number "+first+" is negative.");
        }
        else{
            System.out.println("The number "+first+" is Zero.");
        }
    }
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a number:");
        int number= op.nextInt();
        Checker(number);
        

    }
}
