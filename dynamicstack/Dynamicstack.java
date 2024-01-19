public class Dynamicstack{
  

    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

   public void push(int data){
       
       if(size()==capacity){
             expand();
       }
          //System.out.println(size());
        stack[top] = data;
        top++;
       
        //System.out.println(size());

    }
    private void expand(){

        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
        System.out.println(length);
        System.out.println("Afterexpanding:" + capacity);
    }
    public int pop(){
        int data=0;
        if(isempty()){
            System.out.println("Stack is empty");
        }else{
           top--;
           data = stack[top];
           stack[top] = 0;
           shrink();
        }
        return data;

    }
    private void shrink(){
        int length = size();
        if(length <= (capacity/2)/2){
             capacity = capacity/2;
        }    
        int newStack[] = new int[capacity];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        
    }
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isempty(){
        return top <= 0;
    }
   public void display(){
      for(int arr:stack){
        System.out.print(arr + " ");
      }
      System.out.println();
   }
}