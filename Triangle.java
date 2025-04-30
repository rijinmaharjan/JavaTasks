import java.util.Scanner;
public class Triangle {
    public int Area(int b, int h){
        int area=(b*h)/2;
        return area;
    }
    public static void main(String[] args) {
        Triangle ob= new Triangle();
        Scanner op= new Scanner(System.in);
        int a=op.nextInt();
        int b=op.nextInt();
        int c=ob.Area(a,b);
        System.out.println(c);
    }
    
}
