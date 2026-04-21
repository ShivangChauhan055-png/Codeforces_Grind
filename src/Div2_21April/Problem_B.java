package Div2_21April;
import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                solve(s);
            }
        }
    public static void solve(String s) {
        int n = s.length();
        int pair = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                pair++;
            }
        }
        if (pair <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
