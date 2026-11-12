package Div4_12Nov;

import java.util.Scanner;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean[] vis = new boolean[26];
            for(int i = 0; i < n / 2; i++) {
                int a = s.charAt(i) - 'a';
                int b = s.charAt(n - 1 - i) - 'a';
                if(a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                for(int j = a + 1;j <= b; j++) {
                    vis[j] = true;
                }
            }
            int ans = 0;
            for (int i = 0; i < 26; i++) {
                if (vis[i]) ans++;
            }
            System.out.println(ans);
        }
    }
}
