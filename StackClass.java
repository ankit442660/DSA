
public class StackClass {
public static class  Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }

    
}

public static Node head=null;
    public static void push(int data){
        Node newNode=new Node(data);
       if(isempety()){
        head=newNode;
        return;
       }
       newNode.next=head;
       head=newNode;
    }

    public static int pop(){
        if(isempety()){
            return -1;
        }
        Node top=head;
        head=head.next;
        return top.data;

    }
    public static int peek(){
        if(isempety()){
            return -1;
        }
    return head.data;

    }

  public static boolean isempety()  {
    return head==null;
  }



    public static void main(String[] args) {
        // Stack<character> s1=new Stack<>();
        
        StackClass s1=new StackClass();
        s1.push(1);
        s1.push(2);
        s1.pop();
        System.out.println(s1.peek());
        
    }
    
}
