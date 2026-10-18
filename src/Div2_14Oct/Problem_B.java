package Div2_14Oct;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            boolean inc = false;
            boolean dec = false;
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i - 1) == s.charAt(i + 1)) {
                    if (s.charAt(i) == s.charAt(i - 1)) {
                        inc = true;
                    } else dec = true;
                }
            }
            int ans = 1;
            if (inc) ans++;
            if (dec) ans++;
            System.out.println(ans);
        }
    }
}
