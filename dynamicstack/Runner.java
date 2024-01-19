public class Runner{
    public static void main(String[] args){

        Dynamicstack nums = new Dynamicstack();
        nums.push(8);
        nums.display();
        nums.push(89);
        nums.display();
        nums.push(15);
        nums.display();
        nums.push(58);
        nums.display();
        nums.push(55);
        nums.display();

        nums.pop();
        nums.display();
        nums.pop();
        nums.display();
        nums.pop();
        nums.display();
        nums.pop();
        nums.display();
        

        

    }
}