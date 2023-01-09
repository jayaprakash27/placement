package Vid15;

public class InfiniteSortedArray{
    public static void main(String[] args) {
        int[] nums = { 2, 3,5 , 7, 9, 12, 13, 17, 25, 28, 34, 51, 53, 83, 97 };
        int target = 97;
        System.out.println(ans(nums, target));
    }
    static int ans(int[] nums,int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            int newstart = end+1;
            end = end + (end-start +1)*2;
            start = newstart;
        }
        return searchRange(nums, target, start, end);
    }

    public static int searchRange(int[] nums, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid-1;
            } else if(target > nums[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}