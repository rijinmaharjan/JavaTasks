import java.util.Scanner;

public class Multiplication {
    public static void MultiTable(int a){
        for(int i =1 ; i<=10;i++){
           System.out.println(a+"*"+i+"="+(a*i));
        
        }

    
    }
    public static void main(String[] args) {
        Scanner op= new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int num= op.nextInt();
        MultiTable(num);
    }
}
