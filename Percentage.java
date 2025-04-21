import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter Mathematics marks:");
        int math= op.nextInt();
        System.out.print("Enter Science marks:");
        int science= op.nextInt();
        System.out.print("Enter English marks:");
        int english= op.nextInt();
        System.out.print("Enter Nepali marks:");
        int nepali= op.nextInt();
        System.out.print("Enter Computer marks:");
        int computer= op.nextInt();
        int total= math+science+english+nepali+computer;
        System.out.println("Total marks obtained is:"+total);
        double percentage=(total/500.0)*100;
        System.out.println("Percentage obtained is:"+percentage+"%");
        if (percentage >= 90 && percentage <= 100) {
            System.out.println("GPA: 4.0");
        } else if (percentage>=80 && percentage<90) {
            System.out.println("GPA: 3.6");
        } else if (percentage>=70 && percentage<80) {
            System.out.println("GPA: 3.0");
        } else if (percentage>=60 && percentage<70) {
            System.out.println("GPA: 2.6");
        } else if (percentage>=50 && percentage<60) {
            System.out.println("GPA: 2.0");
        } else if (percentage>=40 && percentage<50) {
            System.out.println("GPA: 1.6");
        } else {
            System.out.println("Fail");
        }
    }
}
