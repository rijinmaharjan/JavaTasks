public class AverageValue{
    public static void main(String[] args) {
        int [] numbers={1,2,3,4};
        int sum=0;
        for (int i =0 ; i<numbers.length;i++){
            sum+=numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("The average value of the array elements is: " + average);
        System.out.println(numbers.contains(3));
        
    }
}