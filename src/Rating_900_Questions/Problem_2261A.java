package Rating_900_Questions;

import java.util.*;

public class Problem_2261A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int ans ;
            int count = 0;
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    ls.add(i);
                    count++;
                }else continue;
            }
            if(count==1){
                ans = 0;
            }else if(count==2) ans = 1;
            else{
                ans = ls.get(ls.size()-1) - ls.get(0);
            }
            System.out.println(ans);
        }
    }
}
