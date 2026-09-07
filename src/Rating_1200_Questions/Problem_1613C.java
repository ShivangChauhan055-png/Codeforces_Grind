package Rating_1200_Questions;

import java.util.*;

public class Problem_1613C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long h = sc.nextLong();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            long low = 1 ,high = h;
            while(low<=high){
                long mid = low+(high-low)/2;
                long damage = mid;
                for(int i=1;i<n;i++){
                    damage += Math.min(mid,a[i]-a[i-1]);
                    if(damage>=h) break;
                }
                if (damage>=h) high = mid-1;
                else low = mid+1;
            }
            System.out.println(low);
        }
    }
}
