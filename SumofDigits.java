import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = op.nextInt();
        String numStr = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            sum += numStr.charAt(i) - '0';
        }

        System.out.println("Sum of digits: " + sum);
    }
}
