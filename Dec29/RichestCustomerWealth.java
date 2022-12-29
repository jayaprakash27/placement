package Dec29;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{
            {2, 3, 6},
            {4,12, 56, 89},
            {8,1,110}
        };
        System.out.println(maxWealth(accounts));
    }
    public static int maxWealth(int[][] accounts){
        int max_sum = Integer.MIN_VALUE;
        // row = person, col = accounts
        for(int[] person: accounts){
            int personal_sum = 0;
            for (int acc: person) {
                personal_sum+= acc;
            }
            if(personal_sum > max_sum){
                max_sum = personal_sum;
            }
        }
        return max_sum;
    }
}
