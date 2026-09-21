package Div3_21Sep;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();
            int z = 0;
            for(char c : s) {
                if(c == '0') z++;
            }
            if(s[0] == '1') {
                System.out.println(z);
            } else {
                int ans = z;
                int o = 0;
                for(char c : s) {
                    if(c == '0') z--;
                    else o++;
                    ans = Math.min(ans, o + z);
                }
                System.out.println(ans);
            }
        }
    }
}