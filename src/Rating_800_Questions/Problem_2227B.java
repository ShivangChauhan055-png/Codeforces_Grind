package Rating_800_Questions;

import java.util.*;

public class Problem_2227B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int open =0,close=0;
            for(char ch : s.toCharArray()){
                if(ch=='(') open++;
                else if(ch==')') close++;
            }
            if(open==close) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
