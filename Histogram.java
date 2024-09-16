import java.util.Stack;

public class Histogram {
    public static int[] prevsmaller(int a[]){
        int[] ps=new int[a.length];
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<a.length;i++) {
            while(!s1.isEmpty()&& a[s1.peek()] >= a[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=s1.peek();
            }
            s1.push(i);

        }
        return ps;
    }

    public static int[] nextsmaller(int a[]){
        int[] ns=new int[a.length];
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<a.length;i++){
            while (!s1.isEmpty() && a[s1.peek()] <= a[i]) {
                s1.pop();
                
            }
            if(s1.isEmpty()){
                ns[i]=a.length;
            }else{
                ns[i]=s1.peek();
            }
            s1.push(i);
        }
        return ns;
    }
    public static void main(String[] args) {
        int maxArea=0;
        int arr[]={4,2,1,5,6,3,2,4,4};
        int ps[] = prevsmaller(arr);
        int ns[] = nextsmaller(arr);

        for(int i=0;i<arr.length;i++){
            int curr=(ns[i] -ps[i]-1)*arr[i];
            maxArea=Math.max(maxArea,curr);
        }

        System.out.println(maxArea);
    }
    
}
