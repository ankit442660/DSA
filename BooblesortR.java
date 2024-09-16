public class BooblesortR {
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        

    }
    public static void sortArray(int[] arr,int n){
        if(n==0||n==1){
            
        return ;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }

        sortArray(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr={10,3,4,29,10,472,23,4,9};
        sortArray(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        
    }
    
}
