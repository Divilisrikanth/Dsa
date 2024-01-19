import java.util.*;
public class Ex{
    public static void main(String[] args){

        //creating object of scanner class.
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        //creating character array and passing length to it .
        // length of string is length of character array(s.length)
        char[] ch = new char[s.length()];

        for(int i = 0; i < ch.length;i++){
            ch[i] = s.charAt(i);
        }
        // creating new character array
        char[] chr = new char[ch.length];
        for(int i =0;i <chr.length ;i++){
              chr[i] = ch[ch.length-1-i];
              System.out.println(chr[i]);
        }

        //converting character array into string.
        String str = String.copyValueOf(chr);
        System.out.println(str);
         System.out.println(s);
         System.out.println(chr[0]);
        
        //comparing String(str) with orginal string(s).
            if(str.equals(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
    }
}