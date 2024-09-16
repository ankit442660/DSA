public class Quick2 {
    public static int partation(int[]arr ,int low ,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }


    public static void quickshort(int[] arr,int low,int high){
        if(low<high){
            int pi=partation(arr,low ,high);
            quickshort(arr, low, pi-1);
            quickshort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr={10,2 ,4,2,4,53,23,98};

        quickshort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
