package Rating_800_Questions;

import java.util.*;

public class Problem_1859A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();
            Arrays.sort(a);
            if(a[0]==a[n-1]){
                System.out.println(-1);
                break;
            }

        }
    }
}
