import java.util.Scanner;
public class Gpa {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Grade:");
        String Grade=inp.nextLine();
        switch(Grade){
            case "A":
            System.out.println("GPA:4.0");
            break;
            case "B":
            System.out.println("GPA:3.6");
            break;
            case "C":
            System.out.println("GPA:3.0");
            break;
            case "D":
            System.out.println("GPA:2.6");
            break;
            case "E":
            System.out.println("GPA:2.0");
            break;
            case "F":
            System.out.println("GPA:1.6");
            break;
            default:
            System.out.println("Enter a valid input.");
        }
    }
    
}
