public class AverageVal {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int a=0;
        for(int i=0;i<array1.length;i++){
            a+=array1[i];
        }
        double b= a;
        double average= b/array1.length;
        System.out.println(average);
    }
    
}
