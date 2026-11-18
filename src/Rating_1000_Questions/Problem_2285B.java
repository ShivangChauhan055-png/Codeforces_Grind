package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_2285B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int c1 = 0;
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == '1') c1++;
            }
            int c0 = n -c1;
            int m1 = Math.min(n, c1 + k);
            int m0 = Math.min(n, c0 + k);
            int m = Math.max(m1, m0);
            int z = n - m;
            int ans = (m *(m + 1) /2 + z*(z + 1) / 2) + 1;
            System.out.println(ans);
        }
    }
}
