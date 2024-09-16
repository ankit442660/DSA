

public class LinkedListQueue {
    static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Queue1 {
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null&&tail==null){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empety Queue");
                return -1;
            }
            int value=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return value;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }
            return head.data;
        }

    
        
    }
        
    

    public static void main(String[] args) {
        Queue1 q = new Queue1();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       while(!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
    }

        
    }
}