import java.util.Stack;

public class StackProblem1 {

    public static void removeButtom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
            
        }
        int temp=s.pop();
        removeButtom(data, s);
        s.push(temp);


    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int temp =s.pop();
        reverse(s);
        removeButtom(temp,s);
    }
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverse(stack);
        // removeButtom(5,stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());

            
        }


    }
}
