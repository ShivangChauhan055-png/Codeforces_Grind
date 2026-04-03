package Super150_contest2;

import java.util.*;

public class Problem_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int ans = 1;
            while(ans <= n) {
                ans <<= 1;
            }
            System.out.println(ans/2 - 1);
        }
    }
}
