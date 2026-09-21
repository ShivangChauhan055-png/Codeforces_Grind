package Rating_1100_Questions;

import java.util.*;

public class Problem_1791G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long c = sc.nextLong();
            List<Long> cost = new ArrayList<>();
            for(int i=1;i<=n;i++){
                long x = sc.nextLong();
                cost.add(i+x);
            }
            Collections.sort(cost);
            int i = 0;
            int ans = 0;
            while (i<n && cost.get(i)<=c){
                c -= cost.get(i);
                ans++;
                i++;
            }
            System.out.println(ans);
        }
    }
}
