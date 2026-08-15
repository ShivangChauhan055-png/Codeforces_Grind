package Rating_900_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_1742B {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int  n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean hoga = true;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    hoga = false;
                    break;
                }
            }
            System.out.println(hoga ? "YES" : "NO");
        }
    }
}
