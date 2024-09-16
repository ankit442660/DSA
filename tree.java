
import java.util.LinkedList;
import java.util.Queue;
public class tree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    
        
    }

    static class BinaryTree {
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    
        
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
         preorder(root.left);
         preorder(root.right);
    }
    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);
        return leftNodes+rightNodes+1;
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    public static void inOrder(Node root){
        if(root==null){
        return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void lavelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q1=new LinkedList<>();
        
        q1.add(root);
        q1.add(null);
        while(!q1.isEmpty()){
            Node temp=q1.remove();
            if(temp==null){
                System.out.println();
                if(q1.isEmpty()){
                    break;
                }else{
                    q1.add(null);
                }
                
            }else{
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    q1.add(temp.left);
                }
                if(temp.right !=null){
                    q1.add(temp.right);
                }
            }
        }
    }
    public static int sumOfLevelorder(Node root){
        if(root==null){
            return 0;
        }
        Queue<Node> q1=new LinkedList<>();
        q1.add(root);
        q1.add(null);
        int val=0;
        while (!q1.isEmpty()) {
            Node curr=q1.remove();
            if(curr==null){
                if(q1.isEmpty()){
                    break;
                }else{
                    q1.add(null);
                }
            }else{
                val=val+curr.data;
                if(curr.left!=null){
                    q1.add(curr.left);
                }if(curr.right!=null){
                    q1.add(curr.right);
                }
            }
            
        }
        return val;

    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int maxHeight=Math.max(leftHeight,rightHeight);
        return maxHeight+1;

    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    public static int sum(Node root,int level){
        if(root==null){
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum1=0;
        int count=1;
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    count++;
                    q.add(null);
                }
            }else{
                if(count==level){
                    sum1=sum1+curr.data;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }if(curr.right!=null){
                    q.add(curr.right);
                }
            }

        }
        return sum1;
    }

    

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
        Node root=tree.buildTree(nodes);
        // preorder(root);
        System.out.println(sumOfNodes(root));
        lavelOrder(root);
        System.out.println(sumOfLevelorder(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(sum(root, 3));
    }
    
}
