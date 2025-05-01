import java.util.Scanner;

public class CountString {
    public static int countWords(String sentence){
        int count=0;
        for (int i = 0; i < sentence.length(); i++) {
        if (sentence.charAt(i) != ' ' && (i == 0 || sentence.charAt(i - 1) == ' ')) {
            count++;
        }
        
    }
    return count;
    }
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String senten= op.nextLine();
        int count=countWords(senten);
        System.out.println("Number of words: " + count);
        }
    
}
