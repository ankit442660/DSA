public class CircularArrayQueue {
    static int a[];
    static int front,rear;
    static int size;
    CircularArrayQueue(int n){
        this.size=n;
        a= new int[n];
        front=rear=-1;
    }
    public static void add(int data){
        if((rear+1)% size == front){
            return;

        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        a[rear]=data;
    }
    public static int remove(){
        if(front==-1){
            System.out.println("empety Queue");
            return -1;
        }
        int value=a[front];
        if(rear==front){
            rear=front=-1;
        }else{
            front=(front+1)%size;
        }
        return value;
    }
    public static int peek(){
        if(front==-1){
            System.out.println("Empety Queue");
            return -1;
        }
        return a[front];
    }
    public static boolean isEmpty(){
        return front==-1;
    }
    public static void main(String[] args) {
        CircularArrayQueue q=new CircularArrayQueue(5);
        q.add(20);
        q.add(80);
        q.add(30);
        q.add(70);
        q.add(90);
        q.remove();
        q.remove();
        q.add(95);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }






        
    }
    
}
