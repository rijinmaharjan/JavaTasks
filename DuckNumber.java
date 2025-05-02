public class DuckNumber {

    public static void checkDuckNumber(int num) {
        int original = num;

        while (num > 0) {
            int digit=num % 10;
            if (digit==0 && original/10!=0) {
                System.out.println(original + " is a Duck number.");
                return;
            }
            num = num / 10;
        }

        System.out.println(original + " is not a Duck number.");
    }

    public static void main(String[] args) {
        int number = 100002;
        checkDuckNumber(number);
    }
}

