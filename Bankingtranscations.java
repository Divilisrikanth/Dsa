// Online Java Compiler
// Use this editor to write, compile and run your Java code online
abstract class Transactions{
  int Initialamount=0;
  int userDepositedamount;
  int userWithdrwanamount;

    abstract void userdepositamount(int Initialammount , int userDepositedamount);
    abstract void userBalanceCheck();
    abstract void withdrawl(int userWithdrwanamount);
    
}
class A extends Transactions {

 void userdepositamount(int Initialammount , int userDepositedamount){
   Initialamount +=userDepositedamount;
  System.out.println(Initialamount);
}

void userBalanceCheck()
{
  System.out.println(Initialamount);
}
void withdrawl(int userWithdrwanamount ) {
   Initialamount -= userWithdrwanamount;
   System.out.println(Initialamount);
}
}

class Main {
    public static void main(String[] args) {
         A ob = new A();
        ob.userdepositamount(0,10000);
       ob.withdrawl(50);
       ob.userBalanceCheck();
        System.out.println("Try programiz.pro");
    }
}