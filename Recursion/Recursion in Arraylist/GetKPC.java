import java.util.*;
public class GetKPC{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
        sc.close();
    }
    
    public static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        return ans;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rans = getKPC(ros);
        ArrayList<String> ans = new ArrayList<>();
        
        String codeforch = codes[ch - '0'];
        for(int i=0; i<codeforch.length(); i++){
            char chcode = codeforch.charAt(i);
            for(String value: rans){
                ans.add(chcode + value);
            }
        }
        return ans;
    }
}