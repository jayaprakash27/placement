import java.util.*;
public class StairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> bans = new ArrayList<>();
        bans.add("");
        return bans;
        } else if(n<0){
            ArrayList<String> bans = new ArrayList<>();
            return bans;
        }
        
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        for(String path: path1){
            paths.add("1"+ path);
        }
        for(String path: path2){
            paths.add("2"+ path);
        }
        for(String path: path3){
            paths.add("3"+ path);
        }
        return paths;
    }
}
