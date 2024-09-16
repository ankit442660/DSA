public class DuplicateString {
    public static String data(String s){
        int i=0;
        int j=0;
        String result="";
        while (j<s.length()) {
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else if(s.charAt(i)!=s.charAt(j) ){
                result +=s.charAt(i);
                i=j;
                j++;

            }
            
        }


        result +=s.charAt(j-1);

        return result;

    }
    public static void main(String[] args) {
        String s1="aabcbcaaaba a";
        System.out.println(data(s1));

        
    }
    
}
