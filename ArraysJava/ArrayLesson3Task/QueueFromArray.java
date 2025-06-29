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
    public boolean isEmpty(){
        return front>rear;
    }
    public boolean isFull(){
        return rear==capacity-1;
    }
    public void enqueue (int value){
        if (isFull()){
            System.out.println("Queue overflow");
        }
        else{
            rear++;
            queue[rear]=value;
            System.out.println("Enqueued : "+ value);

        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -99;
        }else{
            int value= queue[front];
            front++;
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -999;

        }
        else{
            return queue[front];
        }
    }
}
