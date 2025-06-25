
import java.util.Arrays;
import java.util.Scanner;
public class twoDimensionArray {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        int [] [] twoDarray= new int[5][3];
        int rows=twoDarray.length;
        int columns=twoDarray[0].length;
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print("Enter the number:");
                twoDarray [i][j]=op.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(twoDarray));
        for (int[] row:twoDarray){
            for (int column:row){
                
            }
        }
   }
}
