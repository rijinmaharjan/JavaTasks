public class Fibonaci {

        public static void generateFibonacci(int n){
            int a=0,b=1;
            for(int i=1;i<=n;i++){
                System.out.print(a+" ");
                int next=a+b;
                a=b;
                b=next;
            }
        }
        public static void main(String[] args){
            int terms=10;
            generateFibonacci(terms);
        }
 }

