public class QueueB {
    static class Queue {
    
        
    
    static int arr[];
     static int size;
    static int rear=-1;
    Queue(int n){
        arr = new int[n];
         this.size=n;
        

    }
    public static boolean isempety(){
        return rear==-1;
    }
    public static boolean isfull(){
        return rear == size-1;
    }
    public static void add(int data){
        if(isfull()){
            System.out.println("overflow");
            return;
        }
        arr[++rear]=data;

    }
    public static int remove(){
        if(isempety()){
            System.out.println("empety queue");;
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
rear--;
        return front;
    }
    public static int peek(){
        if(isempety()){
            System.out.println("empety queue");
            return -1;
        }
        return arr[0];
    }
        
}
    public static void main(String[] args) {
        Queue q=new Queue(4);
        q.add(1);
       q.add(2);
       q.add(3);
       System.out.println(q.remove());
       System.out.println(q.peek());

    }
    
}
