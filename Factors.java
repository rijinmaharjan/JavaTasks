import java.util.Scanner;

public class Factors {
    public void check(int a){
        System.out.print("Factors of "+a+ " : ");
        for(int i=1;i<=a;i++){
            if (a%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a= op.nextInt();
        Factors obj = new Factors();
        obj.check(a);    
    }
    
}
