/**
 * LL4
 */
public class LL4 {

    Node head;

    public static int size;
    LL4(){
        size=0;
    }
    public static class Node {
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    
        
    }

    public  void addFirst(int data){
        size++;
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public  void addLast(int data){
        size++;
        Node newnNode=new Node(data);
        if(head==null){
            head=newnNode;
        }
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
            
        }
        currNode.next=newnNode;


    }
    
    public  void deleteGreater(int data){
        if(head==null){
            System.out.println("List is empety we won't be able to delete greater number from :-"+data);
            return;
        }
        Node prNode=head;
        Node curNode=head.next;
        while (curNode!=null) {
            if(curNode.data>data){
                size--;
                prNode.next=prNode.next.next;
            }else
            {
                prNode=prNode.next;
            }
            
            curNode=curNode.next;
            
        }
    
        if(head.data>data){
            size--;
            head=head.next;
        }
    }

    public  void printData(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
            
        }
        System.out.println("null");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empety");
            return;
        }
        size--;
        head=head.next;
        return;

    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empety");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node curNode=head;
        while (curNode.next.next!=null) {
            curNode=curNode.next;
            
        }
        curNode.next=null;
    }
    public void reverseList(){
        if(head==null||head.next==null){
            return;
        }
        Node prNode=head;
        Node curNode=head.next;
        while (curNode!=null) {
           Node newNode=curNode.next;
           curNode.next=prNode;

           //update
           prNode=curNode;
           curNode=newNode;
            
        }
        head.next=null;
        head=prNode;
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newNode=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    public void addMiddle(int data,int idx){
        if(idx>size|| idx<0){
            System.out.println("List Out Of Index");
            return;
        }
        size++;

        Node newNode=new Node(data);
        if(head==null||idx==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node curNode=head;
        
       for(int i=1;i<=size;i++){
        if(i==idx){
            Node nextNode=curNode.next;
            curNode.next=newNode;
            newNode.next=nextNode;
        }
        curNode=curNode.next;
       }
    }


    public void deleteMiddle(){
        
        if(head==null||head.next==null){
            head=null;
            size=0;
            return ;
        }
        size--;
        

        Node preNode =head;
        Node curNode=head;
        while (curNode.next!=null && curNode.next.next!=null) {
            preNode=preNode.next;
            curNode=curNode.next.next;
            
        }
        preNode.next=preNode.next.next;

        
    }
    public void deleteIndex(int idx){
        if(idx>size || idx<0||head==null){
            return;

        }
        if( idx==0){
            head=head.next;
            return;
            
        }
        Node curNode=head;
        for(int i=1;i<=size;i++){
            if(i==idx){
                size--;
                break;

            }
            curNode=curNode.next;
        }
        curNode.next=curNode.next.next;

    }
    public static void main(String[] args) {
        LL4 list =new LL4();
        list.addFirst(19);
        list.addFirst(39);
        list.addFirst(20);
        list.addLast(12);
        list.addMiddle(14,3);
        System.out.println(size);

        list.printData();
        list.deleteIndex(2);
        list.printData();


        // list.reverseList();
        list.head=list.reverseRecursive(list.head);
        list.printData();
        System.out.println(size);
       
       
       
        list.deleteMiddle();
        list.printData();
        list.deleteMiddle();
        list.printData();
        list.deleteLast();
        list.printData();
       
        list.deleteGreater(12);
        list.printData();
        list.deleteIndex(0);
        list.printData();
        list.deleteIndex(1);
        list.printData();

        
    }
}