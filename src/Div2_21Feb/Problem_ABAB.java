package Div2_21Feb;

import java.util.Scanner;

public class Problem_ABAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int l=1;
            int r=n;
            boolean possible = true;
            for(int i=0; i<n; i++){
                char current = s.charAt(i);
                char leftChar=(l%2==1) ? 'a':'b';
                char rightChar=(r%2==1)? 'a':'b';
                if(current==leftChar){
                    l++;
                }else if(current==rightChar){
                    l++;
                }else{
                    possible=false;
                    break;
                }
            }
            System.out.println(possible ? "YES":"NO");
        }
    }
}
