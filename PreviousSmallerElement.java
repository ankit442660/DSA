import java.util.*;

public class PreviousSmallerElement {
    public static void previouselement(int[] arr){
        Stack<Integer> s1=new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            while(!s1.isEmpty() && s1.peek() >=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(s1.peek());
            }
            s1.push(arr[i]);
        }
    }
    public static void previousGreaterelement(int[] arr){
        Stack<Integer> s1=new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            while(!s1.isEmpty() && s1.peek() <=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(s1.peek());
            }
            s1.push(arr[i]);
        }
    }

    
        public static void nextSmallerElement(int[] arr){
            Stack<Integer> s1=new Stack<Integer>();
            int[] arr1=new int[arr.length];
            
            for(int i=arr.length-1 ;i>=0;i-- ){
                
                while(!s1.isEmpty() && s1.peek() >=arr[i]){
                    s1.pop();
                }
                if(s1.isEmpty()){
                    // System.out.println(-1);
                    arr1[i]=-1;
                    
                }else{
                    // System.out.println(s1.peek());
                    arr1[i]=s1.peek();
                
                }
                s1.push(arr[i]);
            }

            for (int i=0;i<arr1.length;i++){
                System.out.println(arr1[i]);
                
             }
        }
    
    public static void main(String[] args) {
        int[] arr={10,20,30,40,20,2,1,5};
        // previouselement(arr);

         previousGreaterelement(arr);
        //nextSmallerElement(arr);
        
    }
}
