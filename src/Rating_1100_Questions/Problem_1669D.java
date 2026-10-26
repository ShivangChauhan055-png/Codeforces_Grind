package Rating_1100_Questions;

import java.util.Scanner;

public class Problem_1669D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean valid = true;
            int i = 0;
            while(i<n){
                if(s.charAt(i)=='W'){
                    i++;
                    continue;
                }
                boolean red = false;
                boolean blue = false;
                while(i<n && s.charAt(i)!='W'){
                    if(s.charAt(i)=='R'){
                        red = true;
                    }else if(s.charAt(i)=='B'){
                        blue = true;
                    }
                    i++;
                }
                if(!red || !blue){
                    valid = false;
                    break;
                }
            }
            if(valid) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
