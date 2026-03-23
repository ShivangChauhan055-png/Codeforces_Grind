package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1873A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            if(s.equals("bca") || s.equals("cab")) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
