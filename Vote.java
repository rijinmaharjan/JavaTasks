import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter your age:");
        int a = op.nextInt();
        System.out.println((a>=18)? "You are eligible":"not eligible");
    }
}
