import java.util.*;
import java.io.*;
class Binarystrings{

   static void minimumSwaps(String s1, String s2){
    if(s1.length() != s2.length()){
       System.out.println(-1);
         //return -1;
    }else{
      int counter1= 0; int counter2 = 0;
     for(int i = 0;i < s1.length(); i++){
        //for(int j = 0;j< str2.length; j++){
         if(s1.charAt(i) == '0' && s2.charAt(i) == '1'){
           counter1++;
         }else if(s1.charAt(i)== '1' && s2.charAt(i)== '0'){
           counter2++;
         }
         
    // }
   }
   int ans = counter1 / 2 + counter2 / 2;
   if(counter1 % 2 == 0 && counter2 % 2 == 0){
      System.out.println(ans);
   }else if((counter1 + counter2)%2 == 0){
     System.out.println(ans + 2);
    }else{
        System.out.println(0);
    }
             
    }
    
  }
   
    public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        String s = input.next();
        int n = input.nextInt();
        String x = input.next();
        
    
      char[] ch1 = new char[m];
      for(int i = 0; i < ch1.length;i++){
        ch1[i] = s.charAt(i);
      }
      char[] ch2 = new char[n];
      for(int i = 0; i < ch2.length;i++){
        ch2[i] = x.charAt(i);
      }
      // System.out.println();
      // for(int i = 0; i<str1.length;i++){
      //   System.out.print(str1[i]);
      // }
       String s1 = new String(ch1);
       String s2 =  new String(ch2);
      // //System.out.println(str);
      // System.out.println();
      // for(int i = 0; i<str2.length;i++){
      // System.out.print(str2[i]);
      // }
      //System.out.println(str1.charAt(i));
        minimumSwaps(s1 ,s2);

      //if(ans!= -1){
        //System.out.println(ans);
      //}else{
        //System.out.println("not possible");
      //}
    }
}
