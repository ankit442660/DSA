public class Permontations {
    public static void printsubsequence(String str, int idx ,String preString){
        if(str.length()== 0){
            System.out.println(preString);
            return;

        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newsString=str.substring(0, i)+str.substring(i+1);
            printsubsequence(newsString, idx, preString+currchar);
        }
    }
    public static void main(String[] args) {
        printsubsequence("abc", 0, " ");
        
    }
}
