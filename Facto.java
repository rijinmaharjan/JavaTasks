public class Facto {
    public static void Factorial(int a){
        int m=1;
        for(int i=a;i>=1;i--){
            m*=i;

        }
        System.out.println(m);
    }
    public static void main(String[] args) {
        Factorial(5);
    }
    
}
