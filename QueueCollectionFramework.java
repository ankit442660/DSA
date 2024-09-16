import java.util.*;


public class QueueCollectionFramework {
    public static void main(String[] args) {
        // Queue<Integer> q= new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(4);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }

    }
    
}
