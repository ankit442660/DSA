public class LL1 {

    Node head;
    public int size;
    LL1(){
        size=0;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public void addFirst(int data){
        size++;
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public int search(int num){
        if(head==null){
            System.out.println("The list is empety");
            return -1;
        }
        Node currNode=head;
        int i=0;

        while (currNode !=null) {
            if(currNode.data==num){
                break;
                
                  
            }
            currNode=currNode.next;
            i++;
            
        }
        return i;

    }
    public void println(){
        if(head==null){
            System.out.println("List is empety");
            return;
        }
        Node curNode=head;
        while (curNode!=null) {
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
            
        }
        System.out.println("null");
    }
    public void deleteGreater(){
        if(head==null){
            System.out.println("List is empety");
            return;
        }
        
        Node preNode=head;
        Node currNode=head.next;
        while (currNode!=null) {
           if(currNode.data > 25){
             
            preNode.next=preNode.next.next;
        size--;
            
            
        

           }else{
           preNode=preNode.next;
                
           }
            currNode =currNode.next;
        }
         
    }
    public static void main(String[] args) {
       LL1 list=new LL1();
       list.addFirst(37);
       list.addFirst(2);
       list.addFirst(27);
       list.addFirst(3);
       list.addFirst(26);
       list.addFirst(5);
       list.addFirst(1);
       list.deleteGreater();
list.println();
       
       System.out.println(list.search(1));
    }
    
}
