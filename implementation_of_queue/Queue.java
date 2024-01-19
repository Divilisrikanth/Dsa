public class Queue{
    int queue[] = new int[5];
    int front;
    int rear;
    int size;
    

    public void enqueue(int data){
       queue[rear] = data;
       rear = (rear + 1)%5 ;
       size = size + 1;


    }
    public int dequeue(){
        int data = queue[front];
        front = (front + 1) % 5;
        size = size - 1;
        return data;
    } 
     public int getsize()
     {
         return size;
     }
     public boolean isFull()
     {
        return size == 5;
     }
     public boolean isEmpty(){
        return size == 0;
     }
    public void show(){

        System.out.print("Elements :");
        for(int i = 0;i < size; i++){
            System.out.print(queue[(front + i) % 5] + " ");
        }
       
    }
}