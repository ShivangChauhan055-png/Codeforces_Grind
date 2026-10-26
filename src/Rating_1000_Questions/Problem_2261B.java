package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_2261B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            long sum = 0;
            for(int i=0;i<n-1;i++){
                if(a[i]==a[i+1]) continue;
                else if(a[i]<a[i+1]) a[i] = a[i]++;
                else a[i+1] = a[i+1]++;
                sum |=a[i];
            }
            System.out.println(sum);
        }
    }
}
