package Div2_21April;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String top = sc.next();
            String bottom = sc.next();
            int[] dp = new int[n + 1];
            Arrays.fill(dp, (int)1e9);
            dp[0] = 0;
            for (int i = 1; i <= n; i++) {
                int makeRed = 0;
                int makeBlue = 0;
                if (top.charAt(i - 1) == 'B') makeRed++;
                if (bottom.charAt(i - 1) == 'B') makeRed++;
                if (top.charAt(i - 1) == 'R') makeBlue++;
                if (bottom.charAt(i - 1) == 'R') makeBlue++;
                dp[i] = Math.min(dp[i], dp[i - 1] + Math.min(makeRed, makeBlue));
                if (i >= 2) {
                    int minCost = (int)1e9;
                    char[] colors = {'R', 'B'};
                    for (char topColor : colors) {
                        for (char bottomColor : colors) {
                            int cost = 0;
                            if (top.charAt(i - 2) != topColor) cost++;
                            if (top.charAt(i - 1) != topColor) cost++;
                            if (bottom.charAt(i - 2) != bottomColor) cost++;
                            if (bottom.charAt(i - 1) != bottomColor) cost++;
                            minCost = Math.min(minCost, cost);
                        }
                    }
                    dp[i] = Math.min(dp[i], dp[i - 2] + minCost);
                }
            }
            System.out.println(dp[n]);
        }
    }
}