package Rating_900_Questions;

import java.util.Scanner;

import java.util.*;

public class Problem_1807D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] pref = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                pref[i] = pref[i - 1] + x;
            }
            long total = pref[n];
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();
                long range = pref[r] - pref[l - 1];
                long len = r - l + 1;
                long sum = total - range + len * k;
                if (sum % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
