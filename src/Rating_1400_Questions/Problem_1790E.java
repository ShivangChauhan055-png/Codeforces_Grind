package Rating_1400_Questions;

import java.util.*;

public class Problem_1790E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long x = sc.nextLong();
//            if(x%2 !=0){
//                System.out.println(-1);
//                continue;
//            }
            if((x&(x>>1))!=0){
                System.out.println(-1);
                continue;
            }else{
                long a = x/2;
                long b = x+a;
                System.out.println(a+" "+b);
            }
        }
    }
}
