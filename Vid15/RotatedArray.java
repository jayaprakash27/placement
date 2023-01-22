package Vid15;

public class RotatedArray {
    public static void main(String[] args) {
    int[] arr = {4,5,6,1,2,3};
    int target = 5;
    int lp= findLast(arr);
    if(target >= arr[0]){
        System.out.println(binarySearch(arr, target, 0, lp));
    } else{
        System.out.println(binarySearch(arr, target, lp+1, arr.length-1));
    }
    }
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while(start<=end){
        int mid = start +(end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if(target > arr[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static int findLast(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
        int mid = start +(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } 
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            } 
            if(arr[mid] <= arr[start]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    
}