package Strings;

public class StringDifference {
    public static void main(String[] args) {
        String str = "abecd";
        solution(str);
    }
    public static void solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            int dif = str.charAt(i) - str.charAt(i-1);
            sb.append(dif);
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
