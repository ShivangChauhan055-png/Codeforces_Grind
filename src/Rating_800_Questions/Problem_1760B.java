package Rating_800_Questions;

import java.util.Scanner;

public class Problem_1760B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int maxi = 0;
            for(int i=0;i<s.length();i++){
                int num = s.charAt(i)-'a'+1;
                maxi = Math.max(maxi,num);
            }
            System.out.println(maxi);
        }
    }
}
