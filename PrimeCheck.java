import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int num = input.nextInt();
        int count = 0;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is Not a Prime Number.");
                count = 1;
                break;
            }
        }

        if (count == 0) {
            System.out.println(num + " is a Prime Number.");
        }
    }
}