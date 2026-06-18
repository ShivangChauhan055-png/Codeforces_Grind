package Rating_800_Questions;

import java.util.*;

public class Problem_2218C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int l = 1;
            int r = 3 * n;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(l).append(" ");
                sb.append(r - 1).append(" ");
                sb.append(r).append(" ");
                l++;
                r -= 2;
            }
            System.out.println(sb);
        }
    }
}
