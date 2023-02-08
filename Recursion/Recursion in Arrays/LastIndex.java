import java.util.*;
public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr, n-1, x));
        sc.close();
    }
    public static int lastIndex(int[] arr, int idx, int x){
        if(idx < 0) return -1;
        int ans = lastIndex(arr, idx-1, x);
        if(arr[idx] == x) ans = idx;
        return ans;
    }
}
