package Strings;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "abc";
        solution(str);
    }
    public static void solution(String str) {
        int n = str.length();
        int total = factorial(n);
        for (int i = 0; i < total; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for (int divisor = n; divisor > 0; divisor--) {
                int q = temp/divisor;
                int r = temp%divisor;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
    public static int factorial(int n) {
        if(n == 0) return 1;
        return n*factorial(n-1);
    }
}
