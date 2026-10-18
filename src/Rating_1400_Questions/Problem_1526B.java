package Rating_1400_Questions;

import java.util.Scanner;

public class Problem_1526B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long x = sc.nextLong();
            boolean flag = false;
            for(int i=0;i*111 <=x;i++){
                int rem  =(int) x- (i*111);
                if(rem%11==0) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
