package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1834A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int postive1 =0;
            int negative1=0;
            int op =0;
            for (int i = 0; i < n; i++) {
                if(arr[i]==1) postive1++;
                else negative1++;
            }
            while(negative1>postive1 || negative1%2==1){
                op++;
                postive1++;
                negative1--;

            }
            System.out.println(op);
        }

    }
}
