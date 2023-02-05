package Strings;

public class Strings {
    public static void main(String[] args) {
        String s = "nitin";
        //SubStrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if(isPalindrome(s.substring(i, j)) == true){
                    System.out.println(s.substring(i,j));
                }
            }
        }
    }
    
    public static boolean isPalindrome(String str) {
        int a = 0;
        int b = str.length() -1;
        while(a <= b){
            if(str.charAt(a) != str.charAt(b)){
                return false;
            } else {
                a++;
                b--;
            }
        }
        return true;
    }
}
