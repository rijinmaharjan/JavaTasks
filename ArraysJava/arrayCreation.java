
import java.util.Arrays;
import java.util.Scanner;

public class arrayCreation {
    static String[] returningArray(String[] array1){
        return array1;
    }

    static void evenNum(int [] numbers){
        // Arrays.toString(numbers);
        for(int j=0; j<numbers.length;j++){
            if (numbers[j]%2==0){
            System.out.println(numbers[j]);
            }
        }
    }
    public static void main(String[] args) {

        String[] names={"Ace","Spade"};
        int [] numbers=new int[3];
        Scanner op= new Scanner(System.in);
       for (int i=0;i<numbers.length;i++){
            
            System.out.print("Enter a numebr:");
            int a=op.nextInt();
            numbers[i]=a;
            
        }
        names=returningArray(names);
        System.out.println(Arrays.toString(numbers));
        // Arrays.toString(names);
        // System.out.println(names);
        for(int j=0; j<names.length;j++){
            System.out.println(names[j]);
        }
        evenNum(numbers);

    }
    
}
