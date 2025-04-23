import java.util.Scanner;
public class MuliplicationTable {
    public static void main(String[] args) {
        
    Scanner OP= new Scanner(System.in);
    System.out.print("Enter a number:");
    int a= OP.nextInt();
    System.out.println("Multiplication table of"+a);
    for (int i=1;i<=10;i++){
        System.out.println(a+"*"+i+"="+(a*i));

    }
    }
}
