package Rating_1600_Questions;

import java.util.*;

public class Problem_370C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        long nb = sc.nextLong();
        long ns = sc.nextLong();
        long nc = sc.nextLong();

        long pb = sc.nextLong();
        long ps = sc.nextLong();
        long pc = sc.nextLong();

        long r = sc.nextLong();
        /*
        approach :- first freq count kr lo ratio pta chal jaega
        :- bs apply krege and check krege ki kitne burger bna sakte h
         */
        long bread = 0 , sause = 0 , cheese = 0;
        for(char ch  : s.toCharArray()){
            if(ch=='B') bread++;
            else if(ch=='S') sause++;
            else cheese++;
        }
        long low = 0 , high = r+200;
        while(low<=high){
            long mid = low+(high-low)/2;
            // mid bta rha h ki kitne burger bnane h
            long z = 0;
            long r1 = Math.max(bread*mid-nb,z);
            long r2 = Math.max(sause*mid-ns,z);
            long r3 = Math.max(cheese*mid-nc,z);

            long totalPrice = r1*pb + r2*ps + r3*pc;
            if(totalPrice<=r) low = mid+1;
            else high = mid-1;

        }
        System.out.println(high);
    }
}
