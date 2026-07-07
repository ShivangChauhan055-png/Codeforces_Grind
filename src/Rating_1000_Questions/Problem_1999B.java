package Rating_1000_Questions;


import java.util.Scanner;

public class Problem_1999B {
    static int win(int a1,int a2,int b1,int b2){
        int suneeta = 0 , slavic = 0;
        if(a1>b1) suneeta++;
        else if(b1>a1) slavic++;
        if(a2>b2) suneeta++;
        else if(b2>a2) slavic++;
        return suneeta>slavic ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int ans = 0;
            int a1= sc.nextInt();
            int a2= sc.nextInt();
            int b1= sc.nextInt();
            int b2= sc.nextInt();

            ans+=win(a1,a2,b1,b2);
            ans+=win(a1,a2,b2,b1);
            ans+=win(a2,a1,b1,b2);
            ans+=win(a2,a1,b2,b1);
            System.out.println(ans);
        }

    }
}
