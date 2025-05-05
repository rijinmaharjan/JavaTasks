import java.util.Scanner;
public class Calculator {
    public static void CalculatorRunner(){

        Scanner val=new Scanner(System.in);
        System.out.print("Enter first:");
        int a=val.nextInt();
        System.out.print("Enter second:");
        int b=val.nextInt();
        System.out.print("Enter an operator(+,-,*,/):");
        String c= val.next();
        switch(c){
            case "+":
            System.out.println("The sum is :"+ (a+b));
            break;
            case "-":
            System.out.println("The difference is :"+ (a-b));
            break;
            case "*":
            System.out.println("The multiplication is :"+ (a*b));
            break;
            case "/":
            System.out.println("The division is :"+ (a/b));
            break;
            default:
            System.out.println("Invalid operator.");
        }
            
        }
    public static void main(String[] args) {
                CalculatorRunner();

    }
}


