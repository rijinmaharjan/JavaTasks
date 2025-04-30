import java.util.Scanner;

public class OnetoNOdd {
    public static void Odd(){
        System.out.print("Enter a number: ");
        Scanner op=new Scanner(System.in);
        int a = op.nextInt();
        for (int i=1;i<=a;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Odd();
    }
}
