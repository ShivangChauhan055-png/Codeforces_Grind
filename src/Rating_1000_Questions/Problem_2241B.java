package Rating_1000_Questions;

import java.util.Scanner;

public class Problem_2241B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int d = String.valueOf(x).length();
            long y = 1;
            for(int i=0;i<d;i++){
                y*=10;
            }
            y++;
            System.out.println(y);
        }
    }
}
