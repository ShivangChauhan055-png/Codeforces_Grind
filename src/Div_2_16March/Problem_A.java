package Div_2_16March;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            String s = sc.next();
            Set<Integer> See = new HashSet<>();
            int c = 1;
            while(!See.contains(c)){
                See.add(c);
                if(s.charAt(c-1)=='R') c = c+1;
                else c = c-1;
            }
            System.out.println(See.size());
        }
    }
}
