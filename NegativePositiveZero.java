import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter three numbers");
        int a=inp.nextInt();
        if (a>0){
            System.out.println(a+" Is a positive number");
        }
        else if (a<0){
            System.out.println(a+" Is a negative number");
        }
        else{
            System.out.print("ZERO");
        }
    }
    
}
