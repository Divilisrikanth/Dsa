import java.util.*;

class Example2{

    public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
       int s = input.nextInt();
       String n = input.nextLine();
       
       String[] str = new String[s];
       for(int i = 0;i<str.length;i++){
        str[i] = input.nextLine();
       }
   
       for(int i = 0;i<str.length;i++){
         System.out.print(str[i]);
       }
       System.out.println();
      String s1 = str.toString();
        System.out.println(s1);
    }
}
