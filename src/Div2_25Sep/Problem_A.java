package Div2_25Sep;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            int ans = 0;
            int i = 0;
            int j = n - 1;
            while(i < j) {
                char x = s.charAt(i);
                char y = s.charAt(j);
                if(x != y) {
                    if(x == c || y == c) {
                        ans += 1;
                    } else {
                        ans += 2;
                    }
                }
                i++;
                j--;
            }
            System.out.println(ans);
        }
    }
}
