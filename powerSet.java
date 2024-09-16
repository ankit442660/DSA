public class powerSet {
    public static void set(String str,int idx,String neString){
        if(idx==str.length()){
            System.out.println(neString);
            return ;
        }
        set(str, idx+1, neString+str.charAt(idx));
        set(str, idx+1, neString);
    }
    public static void main(String[] args) {
        set("abc", 0, "");
    }
}
