package Div3_12June;

import java.io.*;
import java.util.*;

public class Problem_D {
    static class F {
        int n;
        int[] bit;
        F(int n) {
            this.n = n;
            bit = new int[n + 1];
        }
        void add(int idx, int val) {
            idx++;
            while (idx <= n) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }
        int sum(int idx) {
            idx++;
            int res = 0;
            while (idx > 0) {
                res += bit[idx];
                idx -= idx & -idx;
            }
            return res;
        }
        int rangeSum(int l, int r) {
            if (l > r) return 0;
            return sum(r) - (l == 0 ? 0 : sum(l - 1));
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            int m = map.size();
            int[] val = new int[m];
            int[] cnt = new int[m];
            int idx = 0;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                val[idx] = e.getKey();
                cnt[idx] = e.getValue();
                idx++;
            }
            int[] R = new int[m];
            int r = 0;
            for (int i = 0; i < m; i++) {
                while (r + 1 < m && val[r + 1] <= val[i] + k) r++;
                R[i] = r;
            }
            boolean[] lose = new boolean[m];
            F fw = new F(m);
            for (int i = m - 1; i >= 0; i--) {
                boolean noLose = fw.rangeSum(i + 1, R[i]) == 0;
                lose[i] = (cnt[i] % 2 == 1) && noLose;
                if (lose[i]) fw.add(i, 1);
            }
            boolean Win = false;
            for (int i = 0; i < m; i++) {
                if (!lose[i]) {
                    Win = true;
                    break;
                }
            }
            out.append(Win ? "YES" : "NO").append('\n');
        }
        System.out.print(out);
    }
}