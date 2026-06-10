package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1666D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        while(o-->0){
            String s = sc.next();
            String t = sc.next();
            int n = s.length();
            int m = t.length();
//            while(i>=0 && j>=0){
//                if(s.charAt(i)==t.charAt(j)){
//                    i--;
//                    j--;
//                }else i-=2;
//            }
//            if(j==-1) System.out.println("YES");
//            else System.out.println("NO");

            int[] freq = new int[26];
            for (int i = 0; i < m; i++) {
                freq[t.charAt(i)-'A']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = n-1;i>=0;i--){
                if(freq[s.charAt(i)-'A']>0){
                    freq[s.charAt(i)-'A']--;
                    sb.append(s.charAt(i));
                }
            }
            sb.reverse();
            if(sb.toString().equals(t)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
