package Vid16;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {11,12,13}
        };
        int target = 11;
        System.out.println(Arrays.toString(twoDSearch(arr, target))); 
    }

    public static int[] binarySearch(int[][] arr,int row, int target, int start, int end) {
        while(start<=end){
        int mid = start +(end-start)/2;
            if(target == arr[row][mid]){
                return new int[]{row,mid};
            } else if(target > arr[row][mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] twoDSearch(int[][] arr, int target){
        // My Way
        for(int i=0; i<arr.length; i++){
            int start = 0;
        int end = arr[i].length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target==arr[i][mid]){
                return new int[]{i,mid};
            } else if(target<arr[i][mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        }
        return new int[]{-1,-1};
    }
    static void search2D(int[][] arr, int target){
        int r = 0;
        int c = arr[0].length-1;
        while(r<arr[0].length && c> 0){
            if(arr[r][c] == target){
                System.out.println(r+", "+c);
                break;
            } else if(arr[r][c] > target){
                c--;
            } else{
                r++;
            }
        }
    }
    static void binary2D(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;
        if(rows == 1){
            binarySearch(arr, 0, target, 0, cols-1);
        }
         
    }
}
