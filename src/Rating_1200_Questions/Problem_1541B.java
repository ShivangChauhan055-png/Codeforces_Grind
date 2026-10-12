package Rating_1200_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_1541B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
            }
            //Arrays.sort(a);
            int count =0;
            // a[i]*a[j] = i+j;
            // a[i] = (i+j)/a[j]; for i fixed
            for(int i=1;i<=n;i++){
                for (int x = 1; x * a[i] - i <= n; x++) {
                    int j = x * a[i] - i;
                    if (j > i && j <= n && a[j] == x) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
