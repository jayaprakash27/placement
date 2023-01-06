package Jan06;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 5, 5, 7, 9 };
        int target = 5;
        System.out.println(searchRange(nums, target));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int st = -1;
        int en = -1;
        int[] ans = new int[2];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                st = mid;
                end = mid - 1;
            }
            if (target < nums[mid])
                end = mid - 1;
            if (target > nums[mid])
                start = mid + 1;
        }
        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                en = mid;
                start = mid + 1;
            }
            if (target < nums[mid])
                end = mid - 1;
            if (target > nums[mid])
                start = mid + 1;
        }
        ans[0] = st;
        ans[1] = en;
        return ans;
    }
}
