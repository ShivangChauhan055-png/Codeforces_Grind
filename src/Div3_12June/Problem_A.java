package Div3_12June;

import java.util.*;
public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int mini = Integer.MAX_VALUE;
            int maxi = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();
                mini = Math.min(mini, h);
                maxi = Math.max(maxi, h);
            }
            System.out.println(maxi - mini + 1);
        }
    }
}
