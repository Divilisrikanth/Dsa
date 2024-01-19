import java.util.Scanner;
public class Mainmethod{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
           int n = scanner.nextInt();


            LinkedList list = new LinkedList();
           for(int i = 0; i < n; i++)
          {
            int data = scanner.nextInt();
                list.insert(data);
                   
         }  
         int addingelementatfirst = scanner.nextInt();
         list.insertAtStart(addingelementatfirst);
         int index = scanner.nextInt();
         int insertingatmiddle = scanner.nextInt();
         list.insertAt(index, insertingatmiddle);
         System.out.println("Linkedlist values before deleting:");
         list.show();
         System.out.println();
         int value = scanner.nextInt();
         list.deleteAt(value);
         System.out.println("Linkedlist values after deleting:");
         list.show();

         scanner.close();
    }

}