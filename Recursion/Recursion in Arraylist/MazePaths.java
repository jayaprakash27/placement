import java.util.*;

public class MazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> ans = getMazePaths(1, 1, n, m);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(dr == sr && sc == dc){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sr<dr){
            vpaths = getMazePaths(sr+1, sc, dr, dc);
        }
        if(sc < dc){
            hpaths = getMazePaths(sr, sc+1, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for(String hpath: hpaths){
            paths.add("h"+hpath);
        }
        for(String vpath: vpaths){
            paths.add("v"+vpath);
        }

        return paths;
    }

}