import java.util.Scanner;
 public class Sortedarray{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    int m = input.nextInt();
    int arr[] = new int[m];
     for(int i = 0; i < m ; i++)
     {
      arr[i] = input.nextInt();
     }

     for(int i= 0 ; i < arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
         int temp = 0;
         if(arr[i] < arr[j]){
             temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
          }
          
       }
     }
      
     for(int i = 0; i < arr.length; i++)
     {

      System.out.println("Array is" +" : "+ arr[i]);

     }
   }
}