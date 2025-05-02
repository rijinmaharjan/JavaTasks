public class SumOfdigits {

    public static int sumOfSquares(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit);
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 123;
        int result = sumOfSquares(number);
        System.out.println("Sum of squares of digits: " + result);
    }
}

