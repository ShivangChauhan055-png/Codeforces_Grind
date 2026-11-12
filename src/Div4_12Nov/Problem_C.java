package Div4_12Nov;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int[] ans = new int[n];
            int l = 0;
            int r = n - 1;
            int k = 0;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && a[j].equals(a[i])) {
                    j++;
                }
                int cnt = j - i;
                ans[l++] = a[i];
                k++;
                if (cnt >= 2) {
                    ans[r--] = a[i];
                    k++;
                    for (int x = 2; x < cnt; x++) {
                        ans[l++] = a[i];
                    }
                }
                i = j;
            }
            sb.append(k).append('\n');
            for (int x = 0; x < n; x++) {
                sb.append(ans[x]);
                if (x + 1 < n) {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
