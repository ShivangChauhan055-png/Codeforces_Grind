package Rating_1100_Questions;

import java.lang.*;
import java.util.Scanner;

public class Problem_1682B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int ans = -1;
            for (int i = 0; i < n; i++) {
                int p  = sc.nextInt();
                if(p!=i){
                    if(ans==-1) ans = p;
                    else ans&=p;
                }
            }
            System.out.println(ans);
        }
    }
}
