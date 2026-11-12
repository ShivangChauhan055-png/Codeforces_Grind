package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_2283B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            int multiples = 0;
            for(int i=0;i<n;i++){
                int count = 0;
                for(int j=0;j<n;j++){
                    if(a[j]%a[i]==0) count++;
                    multiples = Math.max(multiples,count);
                }
            }
            System.out.println(n-multiples);
        }
    }
}
