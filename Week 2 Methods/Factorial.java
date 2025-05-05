import java.util.Scanner;

public class Factorial {
    public static void GiveFactorial(){
      Scanner input=new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial:");
        int num=input.nextInt();
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        System.out.println("Factorial of given number is : "+fact);
    }
    public static void main(String [] args){
        GiveFactorial();
    }
}
    

