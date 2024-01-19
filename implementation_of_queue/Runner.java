import java.util.Scanner;
public class Runner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();

         Queue q = new Queue();
          
          int arr[] = new int[n];
          for(int i = 0 ;i < n ;i++){
             arr[i] = scanner.nextInt();
             q.enqueue(arr[i]);
          }
          q.dequeue();
          q.dequeue();
    
          q.show();
          int m = scanner.nextInt();
          for(int i = 0 ;i <= m ;i++){
             arr[i] = scanner.nextInt();
             q.enqueue(arr[i]);
          }
          q.getsize();
          System.out.println("Size is :" + " " + q.getsize());
          System.out.println(q.isFull());
          System.out.println(q.isEmpty());
          q.show();
          scanner.close();
    }
}