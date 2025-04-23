import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.print("Enter three numbers");
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
        if (a>b){
            if(a>c){
                System.out.println(a+" is the highest number.");
            }
            else{
                System.out.println(c+" is the highest number.");
            }
        }
        else{
            if(b>c){
            System.out.println(b+" is the highest number.");
            }
            else{
                System.out.println(c+" is the highest number.");
            }


        }

    }
}
        

