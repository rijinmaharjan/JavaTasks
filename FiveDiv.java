import java.util.Scanner;
public class FiveDiv {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=in.nextInt();
        if (a%5==0 && a%11==0){
            System.out.println("It is divisible by 5 and 11");
        }
        else{
            System.out.println("It is not divisible by 5 and 11");
        }

    
    
    }
}
