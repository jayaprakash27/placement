package Vid15;

public class RotatedArray {
    public static void main(String[] args) {
    int[] arr = {5,6,7,1,2,3,4};
    int target = 3;
    System.out.println(findLast(arr));
    }
    public static int findLast(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = start =(end-start)/2;
        while(start<end){
            if(arr[mid] > arr[mid+1]){
                return mid;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
}

