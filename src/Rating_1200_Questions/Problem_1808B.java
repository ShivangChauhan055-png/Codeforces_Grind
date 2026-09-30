package Rating_1200_Questions;

import java.util.*;

public class Problem_1808B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer>[] v = new ArrayList[m];
            // columns store kra liye
            for (int i = 0; i < m; i++) {
                v[i] = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
                    v[j].add(x);
                }
            }
            // columns sort kr liye
            for (int i = 0; i < m; i++) {
                Collections.sort(v[i]);
            }
            long ans = 0;
            for (int i = 0; i < m; i++) {
                long[] res = new long[n];
                res[n - 1] = v[i].get(n - 1);
                for (int j = n - 2; j >= 0; j--) {
                    res[j] = res[j + 1] + v[i].get(j);
                }
                for (int j = 0; j < n - 1; j++) {
                    long cnt = res[j + 1] - (long)(n - 1 - j) * v[i].get(j);
                    ans += cnt;
                }
            }
            System.out.println(ans);
        }
    }
}
