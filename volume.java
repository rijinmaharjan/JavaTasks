import java.util.Scanner;
public class volume {
    public static void main(String[] args) {
        Scanner OB = new Scanner(System.in);
        System.out.print("Enter Length:");
        int length= OB.nextInt();
        System.out.println("Enter breadth:");
        int breadth= OB.nextInt();
        System.out.println("Enter height:");
        int height= OB.nextInt();
        System.out.println(length*breadth*height);
        OB.close();

    } 
}
    

