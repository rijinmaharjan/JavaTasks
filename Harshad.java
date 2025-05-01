import java.util.Scanner;
public class Harshad {
    public void HarshadOrNot(int num){
        
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }

    }

    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a Number:");
        int nums= op.nextInt();
        Harshad obj= new Harshad(); 
        obj.HarshadOrNot(nums);

    }
}
