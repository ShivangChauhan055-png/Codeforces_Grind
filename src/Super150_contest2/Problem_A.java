package Super150_contest2;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(char c = 'z'; c >= 'b'; c--) {
            boolean ch = true;
            while(ch) {
                ch = false;
                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == c) {
                        if((i > 0 && s.charAt(i-1) == c-1) ||
                                (i < s.length()-1 && s.charAt(i+1) == c-1)) {
                            s = s.substring(0, i) + s.substring(i+1);
                            count++;
                            ch= true;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}