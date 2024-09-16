public class pairling {
    public static int pair(int n){
        if(n<=1){
            return 1;
        }
        return pair(n-1) + (n-1)*pair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
