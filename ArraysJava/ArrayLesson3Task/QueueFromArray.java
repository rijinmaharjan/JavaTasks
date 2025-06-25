public class QueueFromArray {
    int[] queue;
    int capacity;
    int front;
    int rear;
    public QueueFromArray(int capacity){
        queue=new int[capacity];
        this.capacity=capacity;
        front=0;
        rear=-1;
    }
    
}
