package Vid15;

public class SplitArrLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 3;
        System.out.println(splitArray(arr, m));
    }
    static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;
        for(int i = 0; i< arr.length; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        //binary search
        while(start<end){
            //try for the middle for the potential answer
            int mid = start+(end-start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num: arr){
                if(sum+num > mid){
                    // you cannot add item in subarray
                    sum = num;
                    pieces++;
                } else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start = mid+1;
            } else {
                end =  mid;
            }
        }
        return end;
    }

}
