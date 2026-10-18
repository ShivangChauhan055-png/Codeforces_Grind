package Rating_1300_Questions;

import java.util.*;
import java.util.Scanner;

public class Problem_1915E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Set<Long> s = new HashSet<>();
            s.add(0L);
            long sum = 0;
            boolean flag = false;
            for(int i=0;i<n;i++){
                long x = sc.nextLong();
                if(i%2==0) sum+=x;
                else sum -=x;
                if(s.contains(sum)) flag = true;
                s.add(sum);
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
