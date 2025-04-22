import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a alphabet:");
        char alph= Character.toLowerCase(input.next().charAt(0));
        switch(alph){
        case 'a': case 'e': case 'i': case 'o': case 'u':
        System.out.println(alph+" is a vowel.");
        break;
        default:
        System.out.println(alph+" is a consonant.");

    }
    }
    
}
