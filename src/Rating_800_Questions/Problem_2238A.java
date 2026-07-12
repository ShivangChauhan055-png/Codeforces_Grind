package Rating_800_Questions;

import java.util.*;

public class Problem_2238A {
    static int cost(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
                return -1;
            }
            sum += a[i] - b[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int ans = Integer.MAX_VALUE;
            int cur = cost(a, b);
            if (cur != -1) {
                ans = Math.min(ans, cur);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            cur = cost(a, b);
            if (cur != -1) {
                ans = Math.min(ans, cur + c);
            }
            if (ans == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }
        }
    }
}