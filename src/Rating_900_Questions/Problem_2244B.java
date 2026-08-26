package Rating_900_Questions;

import java.util.Scanner;

public class Problem_2244B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean found = true;
            long sum  = 0;
            for(int i=0;i<n;i++){
                sum +=arr[i];
                long formula = ((long) (i + 1) *(i+2))/2;
                if(sum<formula) found = false;
            }
            if(found) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
