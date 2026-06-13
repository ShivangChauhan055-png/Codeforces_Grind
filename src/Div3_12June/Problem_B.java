package Div3_12June;

import java.io.*;
import java.util.*;

public class Problem_B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine();
            int[] p = new int[k];

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    p[i % k] ^= 1;
                }
            }
            boolean ok = true;
            for (int x : p) {
                if (x == 1) {
                    ok = false;
                    break;
                }
            }
            ans.append(ok ? "YES" : "NO").append('\n');
        }
        System.out.print(ans);
    }
}
