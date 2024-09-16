public class Arrayseach {
    public static int search(int[] arr,int size,int target){
        if(size==0){
            return -1;
        }
        if(arr[size-1]==target){
            return 1;
        }else{
            int reamaingpart=search(arr,size-1,target);
            return reamaingpart;

        }

    }
    public static void main(String[] args) {
        int arr[]={10,40,20,38,49,29,48};
int a=search(arr, arr.length, 12);
if(a==1){
    System.err.println("Found");
}else{
    System.out.println("not found");
}
        

    }
}
