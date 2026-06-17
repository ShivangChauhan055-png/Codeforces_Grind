package Rating_800_Questions;

import java.util.*;

public class Problem_2218C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < n; i++) {
                sb.append(i).append(" ");
                sb.append(i+n).append(" ");
                sb.append(i+2*n).append(" ");
            }
            System.out.println(sb);
        }
    }
}
