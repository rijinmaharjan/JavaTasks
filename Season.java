import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner mon= new Scanner(System.in);
        System.out.print("Enter month:");
        int month= mon.nextInt();
        switch(month){
        case 1: case 2: case 3:
        System.out.print("Winter");
        break;
        case 4: case 5: case 6:
        System.out.print("Spring");
        break;
        case 7: case 8: case 9:
        System.out.print("Summer");
        break;
        case 10: case 11: case 12:
        System.out.print("Fall");
        break;
        default:
        System.out.print("Invalid month");
        }
    }
}
