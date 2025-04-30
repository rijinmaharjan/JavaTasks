import java.util.Scanner;

public class SimpleInterest {
    public static void SimpleInterestCalculate(int p, int t, int r){
        int SI=(p*t*r)/100;
        System.out.println("The simple interst is : " + SI);
    }
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Principal:");
        int p1=op.nextInt();
        System.out.print("Time:");
        int t1=op.nextInt();
        System.out.print("Rate:");
        int r1=op.nextInt();
        SimpleInterestCalculate(p1, t1, r1);
    }
    
}
