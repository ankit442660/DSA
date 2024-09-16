import java.util.Scanner;

public class numberToDigit {
    public static void sayDigit(int n,String[] arr){
        if(n==0){
            return;
        }
        int digit=n%10;
        n=n/10;
        sayDigit(n, arr);
        System.out.print(arr[digit]);

    }

    public static void main(String[] args) {
        String arr[]={"zero","one","two","three","four","five","six","seven",
    "eight","nine"};
    Scanner inp=new Scanner(System.in);
    int num=inp.nextInt();
    sayDigit(num, arr);

    }
    
}
