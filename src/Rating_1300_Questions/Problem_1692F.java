package Rating_1300_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1692F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
//            int[] a = new int[n];
//            for(int i=0;i<n;i++){
//                a[i] = sc.nextInt();
//            }
//            boolean found = false;
//            for(int i=0;i<n;i++){
//                for(int j=i+1;j<n;j++){
//                    for(int k= j+1;k<n;k++){
//                        long sum = a[i]+a[j]+a[k];
//                        if(sum%10==3){
//                            found = true;
//                            break;
//                        }
//                    }
//                    if(found) break;
//                }
//                if(found) break;
//            }
//            if(found) System.out.println("YES");
//            else System.out.println("NO");

            // main observation hmme pure integer se mtlb nhi uske last digit se h bo 3 ho
            // and max 3 ele ka pair check krna h ki uska last digit 3 ho

            ArrayList<Integer> ls = new ArrayList();
            int[] freq = new int[10];
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                int ld = x%10;
                if(freq[ld]<3){
                    ls.add(ld);
                    freq[ld]++;
                }
            }
            boolean found = false;
            int m = ls.size();
            for(int i=0;i<m;i++){
                for(int j=i+1;j<m;j++){
                    for(int k=j+1;k<m;k++){
                        int sum = ls.get(i)+ls.get(j)+ls.get(k);
                        if(sum%10==3){
                            found = true;
                            break;
                        }
                    }
                    if(found) break;
                }
                if(found) break;
            }
            if(found) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
