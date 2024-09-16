public class Merge {

    public static void conquer(int[] arr,int si,int mid,int ei){
        int Merge[] = new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while (idx1 <= mid && idx2 <=ei) {
            if(arr[idx1] <= arr[idx2]){
                Merge[x++]=arr[idx1++];
            }else{
                Merge[x++]=arr[idx2++];
            }
            
        }
        while (idx1 <=mid) {
            Merge[x++]=arr[idx1++];
            
        }
        while (idx2 <=ei) {
            Merge[x++]=arr[idx2++];
            
        }
        for(int i=0, j=si; i<Merge.length; i++,j++){
            arr[j]=Merge[i];
        }

    }
    public static void divide(int[] arr,int si,int ei){
        if(ei <= si){
            return; 
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si ,mid,ei);

        
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,5,4,1,13,6,9};
        int ei=arr.length-1;
        int si=0;
        // int mid=si+(ei-si)/2;
        divide(arr, si, ei);

        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
