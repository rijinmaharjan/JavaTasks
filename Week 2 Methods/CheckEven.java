public class CheckEven {
    public static void EvenCheck(){
        System.out.println("Even numbers from 1 to 100: ");
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        EvenCheck();
    }
}
