package Rating_900_Questions;

import java.util.Scanner;

public class Problem_1883B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            for(int i=0;i<n;i++){
                freq[s.charAt(i)-'a']++;
            }
            int odd = 0;
            for (int i = 0; i < 26; i++) {
                if(freq[i]%2==1) odd++;
            }
            // only one odd freq is allow for palindrome so remaining we remove
            if(odd-1 <=k) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
