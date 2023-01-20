package Vid15;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 12, 4, 2, 0};
        int target = 2;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int peak = findPeak(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }else{
            firstTry = orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
        }
        return firstTry;
    }
    public static int orderAgnosticBinarySearch(int[] arr, int target, int st, int end) {
        boolean isAsc = arr[st] < arr[end];
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid-1;
                } else{
                    st = mid+1;
                }
            } else{
                if(arr[mid] > target){ 
                    st = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
        int mid = start+ (end - start)/2;
        if(arr[mid] > arr[mid+1]){
            end = mid;
        } else {
            start = mid+1;
        }
    }
        return start;
    }
}
