class Node{

    String data;
    Node next;
     Node(String data){
        this.data=data;
        this.next=null;
        
     }

}
public class LL {
    Node head;
    public int size1;
    LL(){
      size1=0;  
    }
    
    public void addFirst(String data){
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
        size1++;
    }
    public void addLast(String data){
        Node newNode= new Node(data);
        size1++;
        if(head== null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next !=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }
    public void printList(){
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Empety list, nothing to delete");
            return;
        }
        head =this.head.next;
        size1--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size1--;
        if(head.next==null){
            head=null;
            return;

        }
        Node currNode=head;
        Node lastNode=head.next;
        while (lastNode.next!=null) {
            currNode=currNode.next;
            lastNode=lastNode.next;
            
        }
        currNode.next=null;
    }
public int getsize(){
    return size1;
}
public void addMiddle(int index,String data){
    if(index>size1 || index <0){
        System.out.println("Invalid Index value");
        return;
    }
    size1++;
    Node newNode =new Node(data);
    if(head==null || index==0){
        newNode.next=head;
        head=newNode;
        return;
    }
    Node currNode=head;
    for(int i=0; i<size1 ;i++){
        if(i== index){
            Node nextNode=currNode.next;
            currNode.next=newNode;
            newNode.next=nextNode;
            break;
        }
        currNode=currNode.next;

    }
   

}
public void reverseList(){
    if(head==null || head.next==null){
        return;
    }
    Node prevNode =head;
    Node currNode=head.next;
    while(currNode !=null){
        Node newNode=currNode.next;
        currNode.next=prevNode;
        prevNode=currNode;
        currNode=newNode;
    }
    head.next=null;
    head=prevNode;
}
public void deleteLast(){
    if(head==null) return;
    if(head.next==null){
        head=null;
        return;
    }
    Node curr=head;
    while (curr.next.next!=null) {
        curr=curr.next;
    }
    curr.next=curr.next.next;
}

public String deleteList(int index){
    if(index > size1) return null;
    if(index ==1){
        String val=head.data;
        head=head.next;
        return val;

    }
    Node currNode=head;
    for(int i=1;i<index-1;i++){
        currNode=currNode.next;
    }
    String val=currNode.next.data;
    currNode.next=currNode.next.next;
    return val;

}
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("is");
        list.addFirst("a");
        list.addLast("this");
        // list.printList();
        // System.out.println(list.getsize());
        // list.removeFirst();
        // list.printList();
        // list.removeLast();
        // list.printList();
        list.addMiddle(1,"ankit");
        list.printList();
        list.reverseList();
        list.printList();
        System.out.println(list.deleteList(2));
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        
        
        

        
    }
    
}
