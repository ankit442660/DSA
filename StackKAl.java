import java.util.ArrayList;

public class StackKAl {
   static class  Stack {
    ArrayList<Integer> list = new ArrayList<>();


    public void push(int data){
        list.add(data);
    }

    public  boolean isempety(){
        return list.size()==0;
    }
    public int peek(){
        if(isempety()){
            return -1;
        }
       return list.get(list.size()-1);

    }
    public int pop(){
if(isempety()){
    return -1;
}

       int top= list.remove(list.size()-1);
       return top;
    }
   
    
   }
     public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isempety()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        
     }
}