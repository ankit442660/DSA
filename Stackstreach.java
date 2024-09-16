public class Stackstreach {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node head = null;
    public static int size;

    Stackstreach() {
        size = 0;
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(int data) {
        Node newNode = new Node(data);

        size++;
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        size--;
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public static int size() {
        return size;
    }

    public static void main(String[] args) {
        Stackstreach s1 = new Stackstreach();
        s1.push(3);
        s1.push(5);
        s1.push(67);
        System.out.println(s1.size());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.peek());

    }

}
