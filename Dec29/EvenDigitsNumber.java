package Dec29;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dec29
 */
public class EvenDigitsNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[] { -986712, 457, 6732, 75, 4572 };
        for(int num: findNumbers(nums)){
            System.out.println(num);
        }
    }

    static ArrayList<Integer> findNumbers(int[] nums) {
        ArrayList<Integer> evenDigits = new ArrayList<Integer>();
        for (int num : nums) {
            if (even(num))
                evenDigits.add(num);
        }
        return evenDigits;
    }

    static boolean even(int num) {
        if(num < 0) num *= -1;
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        if(digits%2 == 0) return true;
        return false;
    }
}