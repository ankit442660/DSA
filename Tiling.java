public class Tiling {
    public static int tile(int m,int n){
        if(m<n){
            return 1;
        }
        if(n==m){
            return 2;
        }
        return tile(m-1, n)+tile(m-n, n);
    }
    public static void main(String[] args) {
        System.out.println(tile(5, 2));
    }
}
