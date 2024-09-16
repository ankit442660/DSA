public class palindrom {
    public static boolean palindromString(String str,int firstIdx,int lastIdx){
        if(firstIdx >=lastIdx){
            return true;
        }
        if(str.charAt(firstIdx)!=str.charAt(lastIdx)){
            return false;
        }
        palindromString(str, firstIdx+1, lastIdx-1);
        return true;
    }
    public static void main(String[] args) {
        String str="abbc";
        
        System.out.println(palindromString(str, 0, str.length()-1));
    }
}
