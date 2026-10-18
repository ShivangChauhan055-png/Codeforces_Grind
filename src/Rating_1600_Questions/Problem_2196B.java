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
            int count = 0 ;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if((int)a[i]*a[j] == j-i) count++;
                }
            }
            System.out.println(count);
        }
    }
}
