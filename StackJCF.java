import java.util.Stack;

public class StackJCF {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<Integer>();
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
            
        }
    }
    
}
