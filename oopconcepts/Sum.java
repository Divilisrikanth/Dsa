public class Sum{
    private int a;
    private int b;
    
    // Static block cannot throws an exception. The this and super keywords 
    //cannot be used inside the static block. If a class have multiple blocks 
    //then they will execute in the same order as they written.

    // public static int getfirst(int a){
      //  this.a = a ;
 
    // }
     //This following static block trows an error.
    //error :non-static variable this cannot be referenced from a static context
       // this.a = a ;
        
    public  static int add(int a ,int b){
        int sum = a+b;
        return sum;
    }
    public static void display(){
        System.out.println("static block");
    }
}