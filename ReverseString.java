import java.util.Scanner;
public class ReverseString {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    // System.out.print("");
    System.out.print("Enter something:");
    String a= sc.nextLine();
    String b="";
    for(int i=a.length()-1;i>=0;i--){
        b+=a.charAt(i);
    }
    System.out.println(b);
    sc.close();
  }

 
}
