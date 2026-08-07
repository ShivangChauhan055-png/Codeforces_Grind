package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_1374C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            int count = 0;
            for(int i =0;i<n;i++) {
                if (s.charAt(i) == '(') count++;
                else {
                    if (count > 0) count--;
                    else ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
