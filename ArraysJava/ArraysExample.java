import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample{
    public static void main(String[] args) {
        int[] array1;
        //ways to do it
        array1= new int[5];
        int[] array2= new int[5];
        int[] array3= {1,2,3,4,5};
        //array1[5]=4; // error because 0-4 index

        //to find length
        int len=array1.length;
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<len;i++){
            
            System.out.print("Enter a numebr:");
            int a=sc.nextInt();
            array1[i]=a;
            
        }
        sc.close();
        for(int j=0; j<len;j++){
        System.out.println(array1[j]);
        }
        //or
        for (int arr:array1){
            System.out.println(arr);
        }

        //to print a whole array
        System.out.print(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.print(Arrays.toString(array1));
        
        Arrays.sort(array1);
        int[] copiedArray = Arrays.copyOf(array1, array1.length);
        System.out.println(Arrays.equals(array1, copiedArray));
        int[] newArray=new int[5];
        Arrays.fill(newArray, 0);
        
    }
    
}