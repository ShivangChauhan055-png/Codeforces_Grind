package Rating_800_Questions;

import java.util.*;

public class Problem_1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            HashMap<Integer,Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x,0)+1);
            }
            if(mp.size()==1) System.out.println("Yes");
            else if(mp.size()>2) System.out.println("No");
            else{
                ArrayList<Integer> freq = new ArrayList<>(mp.values());
                if(Math.abs(freq.get(0)-freq.get(1)) <=1){
                    System.out.println("Yes");
                }else System.out.println("No");
            }
        }
    }
}
