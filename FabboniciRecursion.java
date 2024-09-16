import java.util.Arrays;

public class FabboniciRecursion {
    public static int number(int n,int[] arr){
        if(n==0){
            return 0;
        }
        if(n<=3){
            return 1;
        }
        
        
        
        if(arr[n]!=-1) return arr[n];

        return arr[n]=number(n-1,arr)+number(n-2,arr);
    }
    public static void main(String[] args) {
        int n=10;
        int arr[]=new int[n+1];
        Arrays.fill(arr, -1 );
       int pre1=0;
       int pre2=1,curr=0;
        for(int i=2;i<=5;i++){
            curr=pre1+pre2;
            pre1=pre2;
            pre2=curr;
        

        }
        System.out.println(curr);

        System.out.println(number(n,arr));
        for(int a:arr){
            System.out.print(a+" ");
        }
        // for(int i=0;i<=n;i++){
        //     System.out.println(arr[i]);
        // }
        
    }
    
}
