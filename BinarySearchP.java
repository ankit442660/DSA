public class BinarySearchP {


    public static int searchIndex(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        
        while (i<=j) {
            int m=i+(j-i)/2;
            if(arr[m]==target){
                return m;
            }
           else if(arr[m]>target){
                
                j=m-1;
            }else {
                i=m+1;
                
            
            }
            
        }
        return i;
    }

    public static void main(String[] args){
        int[] arr={1,3,4,5,7,9,67};
        System.out.println(searchIndex(arr,34));
    }

    
}