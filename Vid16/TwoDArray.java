package Vid16;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        int target = 5;
        twoDSearch(arr, target);
    }
    static void twoDSearch(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            int start = 0;
        int end = arr[i].length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target==arr[i][mid]){
                System.out.println(i+" "+mid);
                break;
            } else if(target<arr[i][mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        }
    }
}
