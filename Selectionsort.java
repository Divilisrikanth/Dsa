import java.util.Scanner;
public class Selectionsort{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();

        int arr [] = new int[n];
        int temp = 0;

        // minimum value 
        //int minIndex = -1;

        //maximum value
        int maxIndex = -1;

        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Before sorting");

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

         for(int i = 0 ; i < arr.length-1; i++){

             //minimum value for ascending order sorting
             //minIndex = i;

             // maximum value for descending order sorting
             maxIndex = i;
            for(int j = i+1 ; j < arr.length; j++){

              // sorting techinque (logic) for ascending order

             //   if(arr[minIndex] > arr[j]){
             //          minIndex = j ;
             //   }

            //}
             // temp = arr[minIndex];
            // arr[minIndex] = arr[i];
            //  arr[i] = temp;

             // sorting techinque (logic) for descending order

            if(arr[maxIndex] < arr[j]){
                 maxIndex = j ;
            }
          }
            temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;

              System.out.println();

              for(int k : arr){
                 System.out.print(k + " ");
              }
         }

        System.out.println();
        System.out.println("After sorting");
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}