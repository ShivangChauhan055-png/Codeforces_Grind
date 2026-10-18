package Div2_14Oct;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] p = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                long x = sc.nextLong();
                p[i] = (int) ((p[i - 1] + x) % k);
            }
            int[] f = new int[k];
            long ans = 0;
            for (int r = k + 1; r <= n; r++) {
                f[p[r - k - 1]]++;
                ans += f[p[r]];
            }
            System.out.println(ans);
        }
    }
}
