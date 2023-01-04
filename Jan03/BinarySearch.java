package Jan03;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-32, -27, -9, 3, 5, 6, 23, 36, 63};
        int target = 6;
        System.out.println(binarySearch(arr, target));
    }
    // Return the index or -1 if target isnt there
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //Find the middle element
            int mid = start + (end - start)/2; 
            if(target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
