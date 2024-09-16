public class Solution {	
	public static String reverseString(String str) {
		// Write your code here.
	char[] charArray = str.toCharArray();
    int start = 0;
    int end = charArray.length - 1;
    while (start < end) {
        swap(charArray, start, end);
        start += 1;
        end -= 1;
    }
    return new String(charArray);
		
	}
	public static void swap(char[] charArray, int start, int end) {
    char temp = charArray[start];
    charArray[start] = charArray[end];
    charArray[end] = temp;
	}
    public static void main(String[] args) {
       String name="raar";
    

       System.out.println(name); 
     String name1= reverseString(name);
     System.out.println(name1);
    }
}

    

