public class Quick {
    public static int partation(int[] arr,int low ,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low; j<high;j++){
            if(arr[j]< pivot){
                i++;
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // swaping for pivot
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp; 
        return i;
    }
    public static void quickshort(int[] arr,int si, int ei){
        if(si < ei){
            int pi=partation(arr,si,ei);
            quickshort(arr, si, pi-1);
            quickshort(arr, pi+1, ei);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,5,4,6,9};
        int ei=arr.length-1;
        quickshort(arr, 0, ei);

        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }
    
}
