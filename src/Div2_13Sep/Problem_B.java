package Div2_13Sep;

import java.util.*;
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long sum = 0;
            PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0; i < m - 1; i++) {
                pq.add(a[i]);
                sum += a[i];
            }
            long ans = Long.MIN_VALUE;
            for(int i = m - 1; i < n; i++) {
                long score = (long) m * a[i] - sum;
                ans = Math.max(ans, score);
                if(m - 1 > 0 && a[i] < pq.peek()) {
                    sum -= pq.poll();
                    pq.add(a[i]);
                    sum += a[i];
                }
            }
            System.out.println(ans);
        }
    }
}
