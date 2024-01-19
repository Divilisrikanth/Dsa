import java.util.*;
import java.io.*;
class Binarystrings{
static void minimumSwaps(String s1, String s2){
    
  int str1zeros= 0; int str2zeros = 0;
  int str1ones =0;  int str2ones = 0;
  int counter = 0;
  int curOnes = 0;
  int flag = 0;
   for(int i = 0;i < s1.length(); i++){
      if(s1.charAt(i) == '0') {
          str1zeros++;
      }else if(s1.charAt(i) == '1'){
          str1ones++;
      }else if(s2.charAt(i)== '0'){
         str2zeros++;
      }else if(s2.charAt(i)== '1'){
        str2ones++;
      }
    }
       if(str1zeros != str2zeros && str1ones != str2ones){
         System.out.println(-1);
      } else{
        for(int i = 0;i<s1.length();i++){
          if(s1.charAt(i)!=s2.charAt(i)){
            if(s1.charAt(i) =='0' && curOnes > 0){
              s1 = s1.substring(0,i) + '1' + s1.substring(i + 1);
              curOnes --;
              counter++;
            }
            if(s1.charAt(i) == '0' && curOnes == '0'){
               flag++;
               break;
            }
            if(s1.charAt(i) == '1' && s2.charAt(i) == '0') {
              s1 = s1.substring(0,i) + '0' + s1.substring(i+1);
              curOnes++;
              counter++;
            }
          }
            
        }
        if(flag == 0){
            System.out.println(curOnes);
          }
      }
    
  }
    public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
       int s = input.nextInt();
       String n = input.next();
       int t = input.nextInt();
       String x = input.next();

       char[] ch1 = new char[s];
       for(int i = 0;i<ch1.length;i++){
         ch1[i] = n.charAt(i);
       }
       char[] ch2 = new char[t];
       for(int i = 0;i<ch2.length;i++){
        ch2[i] = x.charAt(i);
       }
      String s1 = new String(ch1);
      String s2 = new String(ch2);

       minimumSwaps(s1, s2);
       
    }
   
}
