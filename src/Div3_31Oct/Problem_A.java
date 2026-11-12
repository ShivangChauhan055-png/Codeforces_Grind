package Div3_31Oct;

import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[a.charAt(i) - 'a']++;
            }
            for (int i = 0; i < m; i++) {
                freq[b.charAt(i) - 'a']--;
            }
            String target = "six";
            for (int i = 0; i < target.length(); i++) {
                freq[target.charAt(i) - 'a']--;
            }
            boolean possible = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
