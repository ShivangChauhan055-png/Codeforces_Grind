package Rating_1600_Questions;

import java.util.Scanner;

public class Problem_2196B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
//            int count = 0 ;
//            for(int i=0;i<n;i++){
//                for(int j=i;j<n;j++){
//                    if((int)a[i]*a[j] == j-i) count++;
//                }
//            }
//            System.out.println(count);
            int B = (int) Math.sqrt(n);
            long ans = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] <= B) {
                    for (int k = 1; k <= B; k++) {
                        int j =(int)(i + a[i] * k);
                        if (j < n && a[j] == k) {
                            ans++;
                        }
                    }
                } else {
                    for (int k = 1; (long) k * a[i] < n; k++) {
                        int d = (int)(k * a[i]);
                        int left = i - d;
                        if (left >= 0 && a[left] == k) {
                            ans++;
                        }
                        int right = i + d;
                        if (right < n && a[right] == k) {
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
