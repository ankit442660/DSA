public class test {
    public  int countbit(int a){
         int count= 0;
         while(a> 0){
          count += a&1;
             a >>= 1;
           }
         return count;
    }
    public static void main(String[] args) {
      test t1=new test();
      System.out.println( t1.countbit(15) );
    }
}
