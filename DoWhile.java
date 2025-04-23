import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= op.nextInt();
        int i =1;
        do { 
            System.out.println(a+"*"+i+"="+(a*i));
            i+=1;
        }while (i<=10);
            
         
    }
}
