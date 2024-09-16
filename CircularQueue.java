public class CircularQueue {
     static class Queue {
    static int size;
    static int arr[];
    static int rear=-1;
    static int front=-1;
    Queue(int n){
        arr =new int[n];
        this.size=n;
    }
    public static boolean isempety(){
        return rear==-1 && front==-1;
    }
    public static boolean isfull(){
        return (rear+1)%size==front;
    }
    public static void add(int data){
        if(isfull()){
            System.out.println("overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear= (rear+1)%size;
        arr[rear]=data;
    }
    public static int remove(){
        if(isempety()){
            System.out.println("Queue empety");
            return -1;
        }
        int value=arr[front];
        if(front==rear){
            front = rear =-1;
        }else{
            front=(front+1)%size;
        }
return value;
    }
    public static int peek(){
        if(isempety()){
            System.out.println("Empety Queue");
            return -1;
        }
        return arr[front];
    }
        
    } 
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       System.out.println(q.remove());
       q.add(6);
       System.out.println(q.remove());
       q.add(7);


       while(!q.isempety()) {
           System.out.println(q.remove());
       }

        
    }
}
