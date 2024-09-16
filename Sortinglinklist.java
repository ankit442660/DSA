
public class Sortinglinklist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
    public void printList(){
        if(head==null){
            System.out.println("Empety list");
            return;
        }
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public Node shorting(Node head){
        if(head==null){
            return head;
        }
        int zeronode=0;
        int onenode=0;
        int twonode=0;
        Node curNode=head;
        while(curNode!=null){
            if(curNode.data==0){
                zeronode++;
            }
            else if(curNode.data==1){
                onenode++;
            }else if(curNode.data==2){
                twonode++;
            }
            curNode=curNode.next;
        }
       Node  temp=head;
       while (temp !=null) {
        if(zeronode !=0){
            temp.data=0;
            zeronode--;
        }else if(onenode !=0){
            temp.data=1;
            onenode--;

        }else if(twonode !=2){
            temp.data=2;
            twonode--;
        }
        temp=temp.next;
        
       }

return head;
         
    }

    public  Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newNode=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    public void divNode(){
        Node curr =head;
        int a=0;
        while (curr !=null) {
            a=a+1;
            curr=curr.next;
            
        }
          int x=a/2;
        while( x >0){
            head=this.head.next;
            x--;
        }
        

    }
    public static void main(String[] args) {
        Sortinglinklist list=new Sortinglinklist();
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(0);
        list.printList();
        list.divNode();
        list.printList();
    //    list.head=list.shorting(list.head);
    //    list.printList();
    //    list.head=list.reverse(list.head);
    //    list.printList();
    }
}
