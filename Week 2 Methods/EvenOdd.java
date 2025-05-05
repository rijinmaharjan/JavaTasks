import java.util.Scanner;

public class EvenOdd {
public static void EvenOddCheck(int num){
    if (num%2==0){
        System.out.println("It is even.");
    }
    else{
        System.out.println("It is odd.");
    }
}
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter a number:");
    int a=in.nextInt();
    EvenOddCheck(a);
}
}
