package Div3_21Sep;

import java.util.*;
public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt() - i;
            }
            Arrays.sort(b);
            int m = 1;
            int c = 1;
            for(int i = 1; i < n; i++){
                if(b[i] == b[i-1]){
                    continue;
                }else if(b[i] == b[i-1] + 1){
                    c++;
                    m = Math.max(m, c);
                }else {
                    c = 1;
                }
            }
            System.out.println(m);
        }
    }
}
