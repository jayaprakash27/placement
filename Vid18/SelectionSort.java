package Vid18;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = {1,5,7,2,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = findMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr;

    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]< arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
