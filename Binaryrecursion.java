public class Binaryrecursion {

    public static int  rescursion(int [] arr,int i,int j,int m,int target){
        if(i>j){
            System.out.println(i);
            return i;
        }
        if(arr[m]==target){
            System.out.println(m);
            return m;
        }else if(arr[m]<target){
          return  rescursion(arr, i=m+1, j, m=i+(j-i)/2, target);
        }else{
          return  rescursion(arr, i,j=m-1, m=i+(j-i)/2,  target);
        }
        
    }

    public static void main(String[] args) {
        int[] arr={10,30,40,56,70,80,93};
        int m=0+(arr.length-1)/2;
        System.out.println(rescursion(arr, 0,arr.length,m,22));  
        
    }
    
}
