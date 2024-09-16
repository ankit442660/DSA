public class LL2 {
    Node head;
public int size;
LL2(){
    size=0;
}

    class Node{
         String data;
         Node next;
         Node(String data){
           this.data=data;
           this.next=null;
         }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        size++;
        newNode.next=head;
        head=newNode;

    }
    public void addLast(String data){
        Node newNode=new  Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next=newNode;

    }
    public void printList(){
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
            
        }
        System.out.println("null");
        
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Empety list !");
            return;
        }
        head=this.head.next;
        size--;
    }
    public int getsize(){
        return size;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empety list !");
return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node curNode=head;
        Node nexNode=head.next;
        while(nexNode.next!=null){
            curNode=curNode.next;
            nexNode=nexNode.next;
        }
        curNode.next=null;
    }
    public void addMiddle(String data,int idx){
        if(idx>size || idx<0){
            System.out.println("invalid index number:");
        }
        Node newNode =new Node(data);
        if(head==null || idx==0){
             newNode.next=head;
             head=newNode;
             return;
        }
        Node currNode=head;
        for(int i=1;i<size;i++){
            if(i==idx){
                Node nextNode=currNode.next;
                currNode.next=newNode;
                newNode.next=nextNode;
                break;
            }
            currNode=currNode.next;

        }
    }
    public void reverseList(){
        if(head==null ||head.next==null){
            return;
        }

        Node preNode =head;
        Node currNode=head.next;
        while (currNode !=null) {
            Node nextNode=currNode.next;
            currNode.next=preNode;
            //update
            preNode=currNode;
            currNode=nextNode;
            
        }
        head.next=null;
        head=preNode;
    }
    public Node reverseRecursive(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node newNode=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }

    public static void main(String[] args) {
       LL2 list=new LL2();
       list.addFirst("a");
       list.addFirst("name");
       list.printList();
       list.addLast("ankit");
       list.printList();
       list.reverseList();
       list.printList();
       list.head= list.reverseRecursive(list.head);
       list.printList();
       System.out.println(list.getsize());
       list.removeFirst();
       list.addMiddle("ank",1);
       list.printList();
       list.removeLast();
       list.printList();


    }
    
}
