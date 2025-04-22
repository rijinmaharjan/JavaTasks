import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                System.out.println(num + " is a perfect square.");
                break;
                      }
        }

        System.out.println(num + " is not a perfect square.");
    }
}
