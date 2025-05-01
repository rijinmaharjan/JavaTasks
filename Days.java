import java.util.Scanner;

public class Days{
    public static void year(int totaldays){
        double inyear= totaldays/365;
        System.out.print(totaldays+" in years is: "+inyear+"years");
    }
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter Days:");
        int entry= op.nextInt();
        year(entry);
    }
}


