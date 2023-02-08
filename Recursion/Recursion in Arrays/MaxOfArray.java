import java.util.*;

public class MaxOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxArray(arr, n-1));
        sc.close();
    }

    public static int maxArray(int[] arr, int idx){
        
        if(idx == 0) return arr[0];
        int max = maxArray(arr, idx-1);
        if(arr[idx] > max) max = arr[idx];
        return max;
    }

}