public class ArrayIsSorted {
    public static boolean isSorted(int[] arr,int size){
        if(size==0||size==1){
            return true;
        }
        if(arr[size-1]<arr[size-2]){
            return false;

        }else{
       boolean reamaingpart= isSorted(arr, size-1);
       return reamaingpart;


        }
        

    }

    public static void main(String[] args) {
        int arr[]={2,34,50,74,78};
        System.out.println(isSorted(arr, arr.length));
        
    }
    
}
