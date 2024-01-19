import java.util.Scanner;
public  class Stack{
      // int arr[]  = new int[n];
      // int top = 0;
      public static void peak(int[] arr){
             int last = arr.length-1;
             System.out.println(last);
       }
      public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           int n = scanner.nextInt();
        

            int arr[]  = new int[n];
            int top = 0;
           for(int i = 0 ; i < n;i++){

               arr[i] = scanner.nextInt();
           }
          //  for(int i = 0 ; i < n;i++){

          //     int data = scanner.nextInt();
          //  }
           
           for(int a:arr){
            System.out.print(a + " ");
           }
           
           peak(arr);
      }
     
}