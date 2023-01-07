package Vid15;

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 14;
        System.out.println(findFloor(arr, target));
    }

    public static int findFloor(int[] arr, int target) {

        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                return target;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                st = mid + 1;
            }
        }
        return arr[end];
    }
}
