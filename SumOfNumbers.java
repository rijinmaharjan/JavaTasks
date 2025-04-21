import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num= input.nextInt();
        int sumofnum=0;
        for(int i=1;i<=num;i++){
            sumofnum+=i;
        }
        System.out.println("The sum of first "+num+" natural numers is: "+sumofnum);
    }
    
}
