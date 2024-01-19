<<<<<<< HEAD
=======
<<<<<<< HEAD
public class Reverseofstring{
    public static void main(String[] args){

        String string = "abcd";
        //char[] ch =string.toCharArray();
       // for(int i = ch.length-1 ;i >=0; i--){
        //    System.out.print(ch[i]);
        //}
        char [] ch = new char[string.length()];
        for(int i = 0; i < ch.length; i++){
            ch[i] = string.charAt(i);
        }
        for(int i = ch.length-1; i >= 0; i--){
            System.out.println(ch[i]);
        }
        String str = String.copyValueOf(ch);
        System.out.println(str);
            if(str != string){

                System.out.println("yes");
            }else{
                System.out.println("no");
            }
    }
=======
>>>>>>> 86fe7a0 (intialize repo)
public class Reverseofstring{
    public static void main(String[] args){

        String string = "abcd";
        //char[] ch =string.toCharArray();
       // for(int i = ch.length-1 ;i >=0; i--){
        //    System.out.print(ch[i]);
        //}
        char [] ch = new char[string.length()];
        for(int i = 0; i < ch.length; i++){
            ch[i] = string.charAt(i);
        }
        for(int i = ch.length-1; i >= 0; i--){
            System.out.println(ch[i]);
        }
        String str = String.copyValueOf(ch);
        System.out.println(str);
            if(str != string){

                System.out.println("yes");
            }else{
                System.out.println("no");
            }
    }
<<<<<<< HEAD
=======
>>>>>>> 2e1c29e (pushing into my repo)
>>>>>>> 86fe7a0 (intialize repo)
}