import java.util.Scanner;

public class Palindrome {
 

        public static void checkPalindrome(int num) {
            int original = num;
            int reversed = 0;
    
            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }
    
            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    
        public static void main(String[] args) {
            Scanner op = new Scanner(System.in);
            System.out.print("Enter a number:");
            int number=op.nextInt();
            checkPalindrome(number);
        }
    }
    
    

