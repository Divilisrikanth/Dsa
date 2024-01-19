public class Sample{
  public static void main(String[] args){
//System.out.println("hello world ! sample file");

//     int [] arr ={56,44,322,98,65,78,63,99};

//       for(int i = 0;i<arr.length; i++){
//         System.out.println(arr[i] + " ");
//       }
//       int sum = 65; 
      
      
//  }

try {
  int[] myNumbers = {1, 2, 3};
  for(int i = 0;i<myNumbers.length; i++){
  System.out.println(myNumbers[i]);
  }
} catch (Exception e) {
  System.out.println("Something went wrong.");
} 
finally
 {
  System.out.println("The 'try catch' is finished.");
}
}
}
// An abstract can contain a static method. It is because a static method though not overridden 
// can be hidden. But an abstract method cannot be declared static at the same time as an abstract method 
// must be overridden ans implemented by a subclass's method and declaring it static will prevent overriding

// An abstract class may have static fields and static methods. You can use these static members 
// with a class reference (for example, AbstractClass.staticMethod() ) as you would with any other class.

// The Java compiler adds public and abstract keywords before the interface method. Moreover, 
// it adds public, static and final keywords before data members.

// In other words, Interface fields are public, static and final by default, 
// and the methods are public and abstract.

// interface printable{
//   int mn =5
//   void print();
// }

// compiler adds static final before fields and public abstract before
 
//  interface printable{
//  public static final int mn = 5
//  public abstract void print();
// }
//  String str= "Geeks", nstr="";
//         char ch;
       
//       System.out.print("Original word: ");
//       System.out.println("Geeks"); //Example word
       
//       for (int i=0; i<str.length(); i++)
//       {
//         ch= str.charAt(i); //extracts each character
//         nstr= ch+nstr; //adds each character in front of the existing string
//       }
//       System.out.println("Reversed word: "+ nstr);
