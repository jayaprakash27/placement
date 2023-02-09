import java.io.*;
import java.util.*;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        char ch = str.charAt(0);
        String ross = str.substring(1);
        ArrayList<String> rans = gss(ross);
        ArrayList<String> ans = new ArrayList<>();
        for (String val : rans) {
            ans.add(""+val);
            ans.add(ch+val);
        }
        return ans;
    }

}