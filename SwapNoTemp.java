public class SwapNoTemp {
 


        public static void swapNumbers(int a, int b) {
            a = a + b;
            b = a - b;
            a = a - b;
            
            System.out.println("After, a = " + a + ", b = " + b);
        }
    
        public static void main(String[] args) {
            int num1 = 5;
            int num2 = 10;
    
            System.out.println("Before swapping: a = " + num1 + ", b = " + num2);
            swapNumbers(num1, num2);
        }
    }
    


    

