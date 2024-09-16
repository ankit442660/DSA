public class sumArray {
    public static int sum1(int[] arr,int length){
        if(length==0){
            return 0;
        
        }if(length==1){
            return arr[0];
        }
       int reamaingpart=sum1(arr, length-1);
      int sum=arr[length-1]+reamaingpart;
      return sum;
        

        


    }

    public static void main(String[] args) {
        int arr[]={10,39,40,20};
    System.out.println(sum1(arr, 4));
    }
    
}
