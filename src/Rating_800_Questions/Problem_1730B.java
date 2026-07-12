package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1730B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            boolean[] arr = new boolean[26];
            for(char ch : s.toCharArray()){
                int i = ch-'A';
                if(!arr[i]){
                    ans+=2;
                    arr[i]=true;
                }else ans+=1;
            }
            System.out.println(ans);
        }
    }
}
