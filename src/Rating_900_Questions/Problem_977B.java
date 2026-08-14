package Rating_900_Questions;

import java.util.*;

public class Problem_977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        String s = sc.next();
        HashMap<String,Integer> mp = new HashMap<>();
        String ans = "";
        int max = 0;
        for(int i=0;i<n-1;i++){
            String sb = s.substring(i,i+2);
            mp.put(sb,mp.getOrDefault(sb,0)+1);
            if(mp.get(sb)>max){
                max = mp.get(sb);
                ans = sb;
            }
        }
        System.out.println(ans);
    }
}
