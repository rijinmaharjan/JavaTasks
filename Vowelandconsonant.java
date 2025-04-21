import java.util.Scanner;

public class Vowelandconsonant {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter a alphabet:");
        String Alpha=inp.nextLine().toLowerCase();
        // char a='a';
        // a= Character.toLowerCase(a);
        if (Alpha.equals("a")||Alpha.equals("e")||Alpha.equals("i")||Alpha.equals("o")||Alpha.equals("u")){
            System.out.println(Alpha+" is a vowel");
        }
        else{
            System.out.println(Alpha+" is a consonant");
        }
    }
}
