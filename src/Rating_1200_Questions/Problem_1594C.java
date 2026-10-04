package Rating_1200_Questions;

import java.util.*;

public class Problem_1594C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            char c = sc.next().charAt(0); // ye sc.next() string ke liye and charAt(0) bo ek char
            String s = sc.next();
            boolean allsame = true;
            for(char ch : s.toCharArray()){
                if(ch!=c){
                    allsame = false;
                    break;
                }
            }
            if(allsame){
                System.out.println(0);
                continue;
            }
            int ans = -1;
            for(int i=1;i<=n;i++){
                boolean ok = true;
                for(int j=i;j<=n;j+=i){
                    if(s.charAt(j-1)!=c){
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    ans = i;
                    break;
                }
            }
            if(ans != -1){
                System.out.println(1);
                System.out.println(ans);
            }else{
                System.out.println(2);
                System.out.println(n-1+" "+n);
            }
        }
    }
}
