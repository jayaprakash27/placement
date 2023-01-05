package Jan05;

public class CeilingChar {
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j', 'l', 'y' };
        char target = 's';
        System.out.println(findCeiling(arr, target));
    }

    public static char findCeiling(char[] arr, char target) {
        int st = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return arr[0];
        }
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                st = mid + 1;
            }
        }
        return arr[st];
    }
}
