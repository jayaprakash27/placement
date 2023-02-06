package Recursion;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("Decreasing: ");
    decrease(num);
    System.out.println("Increasing: ");
    increase(num);
    sc.close();
    }
    public static void decrease(int n) {
        if(n == 0) return;
        System.out.println(n);
        decrease(n-1);
    }
    public static void increase(int n) {
        if(n == 0) return;
        increase(n-1);
        System.out.println(n);
    }
}
