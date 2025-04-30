import java.util.Scanner;
public class Even {
    public void EvenOrNot(int a){
        if (a%2==0){
            System.out.print("The number "+a+" is even.");

        }
        else{
            System.out.print("The number "+a+" is not even.");
        }
    }
    public static void main(String[] args) {
        Even obj= new Even();
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= op.nextInt();
        obj.EvenOrNot(number);
    }
    
}
