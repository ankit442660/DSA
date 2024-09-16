public class path {
    public static int countpath(int i,int j,int m, int n){
        if(i==m-1 || j==n-1){
            return 1;
        }
       return countpath(i+1, j, m, n)+countpath(i, j+1, m, n);
    }
    public static void main(String[] args) {
        System.out.println(countpath(0, 0, 3, 3));
    }
}
