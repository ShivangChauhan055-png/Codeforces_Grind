package Rating_1000_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1760D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                if(i==0 || x!=ls.get(ls.size()-1)) ls.add(x);
            }
            int valley = 0;
            for(int i=0;i<ls.size();i++){
                if((i==0 || ls.get(i-1)> ls.get(i)) &&( i==ls.size()-1 || ls.get(i)< ls.get(i+1))) valley++;
            }
            System.out.println(valley==1 ? "YES" : "NO");
        }
    }
}
