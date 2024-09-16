public class StringPalindromeR {
    public static boolean isPalindrome(String arr,int i){
        int j=arr.length()-i-1;
        if(i>j){
            return true;
        }
        if(!(arr.charAt(i)==arr.charAt(j))){
            return false;
        }
        i++;
        
        return isPalindrome(arr, i);
    }

    public static void main(String[] args) {
        String name="raar";
        System.out.println(isPalindrome(name, 0));
        
    }
}