package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1380A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr  = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean yes = false;
            for(int i=1;i<n-1;i++){
                if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                    System.out.println("Yes");
                    System.out.println((i)+" "+(i+1)+" "+(i+2));
                    yes = true;
                    break;
                }
            }
            if(!yes) System.out.println("NO");
        }
    }
}
